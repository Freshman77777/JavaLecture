package ch11.sec07_string;

/**
 * ������ �ð迡 3�� ǥ�õǴ� �ð��� �� ���ΰ�?
 */
public class Q01_DigitalClock {

	public static void main(String[] args) {
		int seconds = 0;
		for (int hour=0; hour<=23; hour++) {
			for (int minute=0; minute<=59; minute++) {
				String timeStr = hour + ":" + minute;
				if (timeStr.indexOf("3") >= 0)
					seconds += 60;
			}
		}
		System.out.println("������ �ð迡 3�� ǥ�õǴ� �ð�: " + seconds + " ��");
	}
}
