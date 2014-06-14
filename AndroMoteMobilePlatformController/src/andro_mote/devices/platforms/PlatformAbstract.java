package andro_mote.devices.platforms;

import andro_mote.commons.PacketType.IPacketType;
import andro_mote.commons.PacketType.Motion;
import andro_mote.ioio_service.EnginesControllerService;
import andro_mote.logger.AndroMoteLogger;
import andro_mote.stepper.Step;
import android.text.format.Time;

public abstract class PlatformAbstract implements Platform {
	private static final String TAG = PlatformAbstract.class.toString();
	private AndroMoteLogger logger = new AndroMoteLogger(PlatformAbstract.class);

	/**
	 * Logowanie aktualnego czasu na podany logger.
	 * 
	 * @param logger
	 * @param TAG
	 */
	protected void logTimestamp(AndroMoteLogger logger, String TAG) {
		Time now = new Time();
		now.setToNow();
		logger.debug(TAG, now.format("%d.%m.%Y %H:%M:%S:%f"));
	}
	
	protected abstract void setValuesForSimpleStep(IPacketType packetType);
	
	public abstract void stop();
	
	@Override
	public void takeStep(Step step) {
		logger.debug(TAG, "NewbrightModel: step execution");
		if (step.getStepType() == Motion.MOVE_FORWARD_REQUEST
				|| step.getStepType() == Motion.MOVE_RIGHT_FORWARD_REQUEST
				|| step.getStepType() == Motion.MOVE_LEFT_FORWARD_REQUEST
				|| step.getStepType() == Motion.MOVE_LEFT_REQUEST || step.getStepType() == Motion.MOVE_RIGHT_REQUEST
				|| step.getStepType() == Motion.MOVE_LEFT_BACKWARD_REQUEST
				|| step.getStepType() == Motion.MOVE_RIGHT_BACKWARD_REQUEST
				|| step.getStepType() == Motion.MOVE_BACKWARD_REQUEST) {
			TakeStepThread makeStep = new TakeStepThread(step);
			makeStep.startThread();
		} 
	}
	
	private class TakeStepThread implements Runnable {

		private Thread blinker = null;
		private Step step = null;

		public TakeStepThread(Step step) {
			this.step = step;
		}

		public void startThread() {
			logger.debug(TAG, "Starting make step Thread...");
			blinker = new Thread(this);
			blinker.start();
		}

		public void stopThread() {
			logger.debug(TAG, "Stopping make step Thread...");
			blinker = null;
		}

		@Override
		public void run() {
			long stepStartTime = 0;
			long stepStopTime = 0;
			try {
				//TODO wydzielić do odrebnej struktury/singletonu 
				EnginesControllerService.isOperationExecuted = true;
				stepStartTime = System.currentTimeMillis();

				// zmiana stanu silników
				setValuesForSimpleStep(step.getStepType());

				// początek kroku
				//TODO wydzielić do odrebnej struktury/singletonu 
				Thread.sleep(EnginesControllerService.stepDuration);
				stepStopTime = System.currentTimeMillis();
				// koniec kroku

				// zatrzymanie węzła
				stop();

				// przerwa pomiędzy kolejnymi krokami
				Thread.sleep(EnginesControllerService.getPauseTimeBetweenSteps());
				EnginesControllerService.isOperationExecuted = false;
			} catch (InterruptedException e) {
				logger.error(TAG, e);
			} finally {
				//TODO wydzielić do odrebnej struktury/singletonu 
				EnginesControllerService.isOperationExecuted = false;
			}

			// wysyłanie pakietu z informacją o wykonanym kroku
			//TODO zmienic lokalizacje logiki
			//FIXME przywrocic funkcje rozsylania broadcastow na zasadzie wzorca obserwator
//			if (driver.getParentControllerService().isSendStepExecutedPacket()) {
//				logger.debug(TAG, "NewBrightModel: broadcasting step executed: " + step.getStepType());
//				driver.getParentControllerService().sendStepExecutedBroadcast(
//						(Motion) Step.getTakenStep((Motion) step.getStepType()), stepStopTime - stepStartTime,
//						EnginesControllerService.getSpeed());
//			}
		}
	}
	
	/**
	 * Funkcja obliczająca o ile stopni i jakim kierunku należy skręcić, aby
	 * osiągnąć kierunek destinationBearing mając azymut początkowy
	 * startBearing. Skręt maksymalnie o 180 stopni. W przypadku skrętu w lewo
	 * zwracana wartość jest ujmena (-180 - 0) a dla skrętu prawo - dodatnie (0
	 * - 180).
	 * 
	 * @param startBearing
	 *            poczatkowa pozycja węzła
	 * @param destinationBearing
	 *            docelowy kierunek węzła
	 * @return liczba stopni o jakie należy zmienić kierunek początkowy aby
	 *         osiągnąć kierunek docelowy
	 */
//	public static int calculateTurn(int startBearing, int destinationBearing) {
//		// 1
//		if (startBearing >= 180 && startBearing <= 360 && destinationBearing >= 180 && destinationBearing <= 360) {
//			return -(startBearing - destinationBearing);
//		}
//		// 2
//		else if (startBearing <= 180 && startBearing >= 0 && destinationBearing >= 180 && destinationBearing <= 360) {
//			if ((destinationBearing - startBearing) <= 180) {
//				return (destinationBearing - startBearing);
//			} else {
//				return -((360 - destinationBearing) + startBearing);
//			}
//		}
//		// 3
//		else if (startBearing >= 180 && startBearing <= 360 && destinationBearing >= 0 && destinationBearing <= 180) {
//			if ((startBearing - destinationBearing) <= 180) {
//				return -(startBearing - destinationBearing);
//			} else {
//				return ((360 - startBearing) + destinationBearing);
//			}
//		}
//		// 4
//		else if (startBearing <= 180 && startBearing >= 0 && destinationBearing <= 180 && destinationBearing >= 0) {
//			return -(startBearing - destinationBearing);
//		} else {
//			return 0;
//		}
//	}
//
//	/**
//	 * Rejestracja listenerów kompasu - rejestracja jest realizowana na czas
//	 * wykonywania skrętu lub innej wymagającej pomiaru położenia czynności.
//	 */
//	protected void registerCompassListeners() {
//		if (driver != null && driver.getParentControllerService().getCompass() != null) {
//			logger.debug(TAG, "Model: registering compass");
//			(new Thread(new RegisterCompassListenersThread(driver.getParentControllerService().getCompass()))).start();
//		} else {
//			logger.debug(TAG, "Model: compass cannot be registered");
//		}
//	}
//
//	/**
//	 * Wyłaczenie kompasu po skończeniu wykonywania kroku.
//	 */
//	protected void unregisterCompassListeners() {
//		if (driver != null && driver.getParentControllerService().getCompass() != null) {
//			logger.debug(TAG, "Model: unregistering compass");
//			(new Thread(new UnregisterCompassListenersThread(driver.getParentControllerService().getCompass())))
//					.start();
//			// looper.getParentControllerService().getCompass().unregisterListeners();
//		} else {
//			logger.debug(TAG, "Model: compass cannot be unregistered");
//		}
//	}


//	/**
//	 * Wątek odpowiedzialny za zlecenie rejestracji listenerów w kompasie
//	 * 
//	 * @author Maciej Gzik
//	 * 
//	 */
//	protected class RegisterCompassListenersThread implements Runnable {
//
//		private Compass compass = null;
//
//		public RegisterCompassListenersThread(Compass compass) {
//			this.compass = compass;
//		}
//
//		@Override
//		public void run() {
//			logger.debug(TAG, "RegisterCompassListenersThread: registering compass");
//			compass.registerListeners(SensorManager.SENSOR_DELAY_GAME);
//		}
//	}
//
//	/**
//	 * Wątek odpowiedzialny za zlecenie wyrejestrowania listenerów kompasu.
//	 */
//	protected class UnregisterCompassListenersThread implements Runnable {
//
//		private Compass compass = null;
//
//		public UnregisterCompassListenersThread(Compass compass) {
//			this.compass = compass;
//		}
//
//		@Override
//		public void run() {
//			logger.debug(TAG, "RegisterCompassListenersThread: registering compass");
//			compass.unregisterListeners();
//		}
//	}

//	@Override
//	public IPacketType getCurrentStepName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}