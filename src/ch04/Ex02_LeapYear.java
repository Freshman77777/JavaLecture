package ch04;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		System.out.println("1996���� " + leapYear2(1996) + "�Դϴ�.");
		System.out.println("2000���� " + leapYear2(2000) + "�Դϴ�.");
		System.out.println("1900���� " + leapYear2(1900) + "�Դϴ�.");
		System.out.println("2022���� " + leapYear2(2022) + "�Դϴ�.");
	}

	private static String leapYear(int year) {
		String result;
		if (year % 400 == 0)
			result = "����";
		else if (year % 4 == 0 && year % 100 != 0)
			result = "����";
		else
			result = "���";
		return result;
	}
	private static String leapYear2(int year) {
		if (year % 400 == 0)
			return "����";
		if (year % 4 == 0 && year % 100 != 0)
			return "����";
		return "���";
	}
}