package pl.fester3k.androcode.deviceManagement.action.phone;

import java.util.List;

import pl.fester3k.androcode.datatypes.ActionParams;
import pl.fester3k.androcode.deviceManagement.action.BaseDeviceAction;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;

public class LocationAction extends BaseDeviceAction implements LocationListener {
	private LocationManager locationManager;
	private Location location;
	private final Handler handler;
	public LocationAction(Context context, Handler handler) {
		super(context);		
		locationManager = (LocationManager)context.getSystemService(Context.LOCATION_SERVICE);
		location = getLastKnownLocation();
		this.handler = handler;
	}

	@Override
	public Object run() {
		double result = 0.0;
		handler.post( new Runnable() {
			@Override
			public void run() {
				locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000L, 4.f, LocationAction.this);
				locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 3000L, 4.f, LocationAction.this);
			}
		});
		if(params.containsKey(ActionParams.Others.GET.toString())) {
			String valueLabel = (String)params.get(ActionParams.Others.GET.toString());
			if(valueLabel.equals("LAT")) {
				result = location.getLatitude();
			}
			if(valueLabel.equals("LONG")) {
				result = location.getLongitude();
			}
			if(valueLabel.equals("SPEED")) {
				result = location.getSpeed();
			}
			if(valueLabel.equals("ALT")) {
				result = location.getAltitude();
			}
		}
		return result;
	}
	
	@Override
	public void cleanup() {
		locationManager.removeUpdates(this);
		super.cleanup();
	}

	@Override
	public void onLocationChanged(Location location) {
		logger.debug("Location changed to " + location.toString());
		this.location = location;
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {}

	@Override
	public void onProviderEnabled(String provider) {}

	@Override
	public void onProviderDisabled(String provider) {}

	private Location getLastKnownLocation() {
	    List<String> providers = locationManager.getProviders(true);
	    Location bestLocation = null;
	    for (String provider : providers) {
	        Location l = locationManager.getLastKnownLocation(provider);
	        logger.debug("last known location, provider: %s, location: %s", provider,
	                l);

	        if (l == null) {
	            continue;
	        }
	        if (bestLocation == null
	                || l.getAccuracy() < bestLocation.getAccuracy()) {
	        	logger.debug("found best last known location: %s", l);
	            bestLocation = l;
	        }
	    }
	    if (bestLocation == null) {
	        return null;
	    }
	    return bestLocation;
	}
}