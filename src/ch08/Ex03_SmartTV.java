package ch08;

/**
 * ���� �������̽� ���� Ŭ����
 */
public class Ex03_SmartTV implements Ex01_RemoteControllable, Ex03_Searchable {
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "��/�� �˻��մϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("SmartTV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > Ex01_RemoteControllable.MAX_VOLUME)
			this.volume = Ex01_RemoteControllable.MAX_VOLUME;
		else if (volume < Ex01_RemoteControllable.MIN_VOLUME)
			this.volume = Ex01_RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("���� SmartTV ����: " + this.volume);
	}
}
