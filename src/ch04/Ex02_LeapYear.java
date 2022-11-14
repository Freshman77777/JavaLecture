package ch04;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		System.out.println("1996년은 " + leapYear2(1996) + "입니다.");
		System.out.println("2000년은 " + leapYear2(2000) + "입니다.");
		System.out.println("1900년은 " + leapYear2(1900) + "입니다.");
		System.out.println("2022년은 " + leapYear2(2022) + "입니다.");
	}

	private static String leapYear(int year) {
		String result;
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 4 == 0 && year % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		return result;
	}
	private static String leapYear2(int year) {
		if (year % 400 == 0)
			return "윤년";
		if (year % 4 == 0 && year % 100 != 0)
			return "윤년";
		return "평년";
	}
}