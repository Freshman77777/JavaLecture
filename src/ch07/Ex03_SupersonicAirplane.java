package ch07;

public class Ex03_SupersonicAirplane extends Ex03_Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC)
			System.out.println("초음속 비행합니다.");
		else
			super.fly();
	}
	
}
