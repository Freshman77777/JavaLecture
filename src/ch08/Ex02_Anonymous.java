package ch08;

public class Ex02_Anonymous {

	public static void main(String[] args) {
		Ex01_RemoteControllable rc = new Ex01_RemoteControllable() {
			@Override
			public void turnOn() {
				System.out.println("�͸�����ü turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("�͸�����ü turnOff()");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("�͸�����ü setVolume(" + volume + ")");
			}
		};
		rc.turnOn();
		rc.setVolume(3);
		rc.setMute(true);
		rc.turnOff();
	}

}
