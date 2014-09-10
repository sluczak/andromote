package andro_mote.platform_controller;

import java.io.Serializable;

import andro_mote.api.AndroMoteMobilePlatformApiAbstract;
import andro_mote.api.IPacket;
import andro_mote.api.exceptions.MobilePlatformException;
import andro_mote.commons.DeviceDefinitions.MobilePlatformType;
import andro_mote.commons.DeviceDefinitions.MotorDriverType;
import andro_mote.commons.IntentsFieldsIdentifiers;
import andro_mote.commons.IntentsIdentifiers;
import andro_mote.commons.MotionMode;
import andro_mote.commons.Packet;
import andro_mote.commons.PacketType;
import andro_mote.commons.PacketType.Engine;
import andro_mote.commons.PacketType.Motion;
import andro_mote.devices.andromote_v2.AdditionalPacketTypes;
import andro_mote.ioio_service.EnginesService;
import andro_mote.ioio_service.EnginesService.LocalBinder;
import andro_mote.logger.AndroMoteLogger;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/**
 * Implementacja API sterowania dla platformy mobilnej AndroMote. API obsługi
 * platformy mobilnej zaimplementowane w projekcie AndroMote. Pozwala w łatwy
 * sposób uruchomić i kontrolować urządzenie. W celu wykorzystania pozostałych
 * modułów aplikacji AndroMote (BT, serwis połączenia z serwerem) należy
 * korzystać bezpośrednio z klas w bibliotekach Android.
 * 
 * @author Maciej Gzik
 * @author Sebastian Łuczak Łuczak
 * 
 */
public class HardwareApi extends AndroMoteMobilePlatformApiAbstract {

	private static final String TAG = HardwareApi.class.toString();
	private static AndroMoteLogger logger = new AndroMoteLogger(HardwareApi.class);
	boolean isBound = false;
	private EnginesService enginesService;

	/**
	 * Konstruktor obiektu API.
	 * 
	 * @param application
	 *            Obiekt aplikacji. Jest wymagany do utworzenia serwisu
	 *            sterowania silnikami oraz rejestrowania obiektów
	 *            rejestrujących zdarzenia sterownika silników.
	 */
	public HardwareApi(Application application) {
		super(application);
	}

	/**
	 * Start serwisu sterowania silnikami.
	 * 
	 * @param platformName
	 *            Nazwa modelu, który jest podłaczony do mikrokontrolera IOIO.
	 *            Lista obsługiwanych modelów znajduje się w klasie
	 *            andro_mote.models.ModelFactory.
	 * @return flaga informująca o tym czy serwis sterowania silnikami został
	 *         uruchomiony.
	 * @throws MobilePlatformException
	 */
	@Override
	public boolean startCommunicationWithDevice(MobilePlatformType platformName, MotorDriverType driverName) throws MobilePlatformException {
		checkIfServiceIsStopped();
		checkIfApplicationIsNull();

		Intent startEngineServiceIntent = new Intent(application, EnginesService.class);
		Packet pack = new Packet(PacketType.Connection.MODEL_NAME);
		pack.setPlatformName(platformName);
		pack.setDriverName(driverName);
		startEngineServiceIntent.putExtra(IntentsFieldsIdentifiers.EXTRA_PACKET, (Serializable) pack);
		ComponentName name = application.startService(startEngineServiceIntent);
		application.bindService(startEngineServiceIntent, connection, Context.BIND_AUTO_CREATE);

		logger.debug(TAG, "AndroMoteEngineControllerApi: startEngineService: " + name);
		return true;
	}

	private ServiceConnection connection = new ServiceConnection() {
		@Override
		public void onServiceConnected(ComponentName className,
				IBinder service) {
			LocalBinder binder = (LocalBinder) service;
			enginesService = binder.getService();
			isBound = true;
		}

		@Override
		public void onServiceDisconnected(ComponentName arg0) {
			isBound = false;
		}
	};

	/**
	 * Zatrzymanie serwisu silników odpowiadające zerwaniu połączenia z
	 * platformą IOIO.
	 * 
	 * @return flaga informująca o tym czy serwis obiekt Intent został
	 *         prawdiłowo wysłany - nie gwarantuje to zatrzymania serwisu
	 *         siników.
	 * @throws EngineServiceException
	 *             Wyjątek rzucany w przypadku wykonania nieprawidłowego
	 *             działania na serwisie silnków - szczegóły w obiekcie wyjątku.
	 */
	public boolean stopCommunicationWithDevice() throws MobilePlatformException {
		checkIfApplicationIsNull();
		if(isBound) {
			application.unbindService(connection);
			isBound = false;
			Intent closeService = new Intent(IntentsIdentifiers.ACTION_ENGINES_CONTROLLER);
			application.stopService(closeService);
		}
		logger.debug(TAG, "AndroMoteEngineControllerApi: stopEngineService: engine service stopped");

		return true;
	}

	@Override
	public boolean setMotionMode(MotionMode motionMode) throws MobilePlatformException {
		checkIfApplicationIsNull();

		Packet setMotionModePacket = null;
		if (motionMode.equals(MotionMode.MOTION_MODE_CONTINUOUS)) {
			setMotionModePacket = new Packet(Engine.SET_CONTINUOUS_MODE);
		} else {
			setMotionModePacket = new Packet(Engine.SET_STEPPER_MODE);
		}
		executeActionOnAndromote(setMotionModePacket);
		logger.debug(TAG, "AndroMoteEngineControllerApi: setMotionMode: motionMode set to: " + motionMode);

		return true;
	}

	/**
	 * Zmiana czasu trwania jednego kroku w trybie STEPPER
	 * 
	 * @param stepDuration
	 *            Czas trwania jednego kroku. Wartość w ms pomiędzy 1 a
	 *            EnginesControllerService.MAX_STEP_DURATION
	 * @return Flaga informująca o tym czy obiekt Intent został prawidłowo
	 *         wysłany.
	 * @throws EngineServiceException
	 *             Wyjątek rzucany w przypadku wykonania nieprawidłowego
	 *             działania na serwisie silnków - szczegóły w obiekcie wyjątku.
	 */
	@Override
	public boolean setStepDuration(int stepDuration) throws MobilePlatformException {
		checkIfApplicationIsNull();

		Packet setStepDurationPacket = new Packet(Engine.SET_STEP_DURATION);
		setStepDurationPacket.setStepDuration(stepDuration);
		executeActionOnAndromote(setStepDurationPacket);
		logger.debug(TAG, "AndroMoteEngineControllerApi: setStepDuration: step duration set to: " + stepDuration);

		return true;
	}

	/**
	 * Przekazanie instrukcji do wykonania przez pojazd
	 * 
	 * @param packet pakiet wysylany do urzadzenia
	 * @return Flaga informująca o tym czy obiekt Intent został prawidłowo
	 *         wysłany.
	 * @throws EngineServiceException
	 *             Wyjątek rzucany w przypadku wykonania nieprawidłowego
	 *             działania na serwisie silnków - szczegóły w obiekcie wyjątku.
	 */
	@Override
	public boolean sendMessageToDevice(IPacket packet) throws MobilePlatformException, UnsupportedOperationException {
		checkIfApplicationIsNull();
		executeActionOnAndromote((Packet)packet);
		logger.debug(TAG,
				"AndroMoteApi: sending message to servicedevice;PacketType: " + ((Packet) packet).getPacketType());
		return true;
	}

	/**
	 * Zlecenie zatrzymania węzła.
	 * 
	 * @return Flaga informująca o tym czy obiekt Intent został prawidłowo
	 *         wysłany.
	 * @throws EngineServiceException
	 *             Wyjątek rzucany w przypadku wykonania nieprawidłowego
	 *             działania na serwisie silnków - szczegóły w obiekcie wyjątku.
	 */
	@Override
	public boolean stopMobilePlatform() throws MobilePlatformException {
		checkIfApplicationIsNull();
		Packet packet = new Packet(Motion.STOP);
		executeActionOnAndromote(packet);
		logger.debug(TAG, "AndroMoteEngineControllerApi: stop");

		return true;
	}
	
	@Override
	public void deviceMessageReceived(Packet pack) throws MobilePlatformException {
		if(pack.getPacketType() == AdditionalPacketTypes.RNVN2Alerts.CHIP_TEMPERATURE_ALERT) {
			stopCommunicationWithDevice();
			logger.error(TAG, "Chip temperature is near 60 Celsius degrees!!");
		}
		logger.debug(TAG,
				"AndroMoteMobilePlatformController: packet from mobile platform received: " + pack.getPacketType());
	}

	@Override
	public boolean checkIfConnectionIsActive() {
		return isEnginesServiceConnectedToIOIO();
	}

	// PRIVATE
	private void executeActionOnAndromote(Packet pack) {
		if(enginesService != null && isEnginesServiceConnectedToIOIO()) {
			enginesService.interpretPacket(pack);
		}
	}

	private boolean isEnginesServiceConnectedToIOIO() {
		if(enginesService != null) {
			return enginesService.isConnectedToIOIO();
		} 
		return false;
	}

	private void checkIfServiceIsStopped() throws MobilePlatformException {
		if (isEnginesServiceConnectedToIOIO()) {
			throw new MobilePlatformException("Engine service already started.");
		}
	}

	private void checkIfApplicationIsNull() throws MobilePlatformException {
		if (application == null) {
			throw new MobilePlatformException(
					"Application object is null. Set application object using setApplication() method!");
		}
	}
}