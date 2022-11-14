package ch08;

/**
 * �������̽� ����
 */
public interface Ex01_RemoteControllable {
	// ���(Constant)
	public int MAX_VOLUME = 10;				// static final �����Ǿ� ����
	public static final int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	void turnOn();			// public abstract �����Ǿ� ����
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	// ����Ʈ �޼ҵ�(Java 1.8 ���� ����) - Ŭ���� ��ü�� �ν��Ͻ� �޼ҵ�
	public default void setMute(boolean mute) {
		if (mute)
			System.out.println("���� ó���մϴ�.");
		else
			System.out.println("���� �����մϴ�.");
	}
	
	// ���� �޼ҵ�(Java 1.8���� ����)
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
