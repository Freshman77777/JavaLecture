package ch08;

public class Ex02_Anonymous {

	public static void main(String[] args) {
		Ex01_RemoteControllable rc = new Ex01_RemoteControllable() {
			@Override
			public void turnOn() {
				System.out.println("劳疙备泅按眉 turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("劳疙备泅按眉 turnOff()");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("劳疙备泅按眉 setVolume(" + volume + ")");
			}
		};
		rc.turnOn();
		rc.setVolume(3);
		rc.setMute(true);
		rc.turnOff();
	}

}
