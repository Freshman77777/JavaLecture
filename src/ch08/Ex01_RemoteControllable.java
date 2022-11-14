package ch08;

/**
 * 인터페이스 선언
 */
public interface Ex01_RemoteControllable {
	// 상수(Constant)
	public int MAX_VOLUME = 10;				// static final 생략되어 있음
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();			// public abstract 생략되어 있음
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	// 디폴트 메소드(Java 1.8 부터 지원) - 클래스 객체의 인스턴스 메소드
	public default void setMute(boolean mute) {
		if (mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제합니다.");
	}
	
	// 정적 메소드(Java 1.8부터 지원)
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
