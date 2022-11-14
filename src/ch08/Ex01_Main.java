package ch08;

/**
 * 
 */
public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_RemoteControllable rc = null;
		rc = new Ex01_Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);							// default method
		Ex01_RemoteControllable.changeBattery();	// static method
		rc.turnOff();
		
		rc = new Ex01_Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		Ex01_RemoteControllable.changeBattery();
		rc.turnOff();
	}

}
