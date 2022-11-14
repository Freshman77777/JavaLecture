package ch11.sec07_string;

public class Ex01_CharAt {

	public static void main(String[] args) {
		String str1 = "A quick brown fox";
		String str2 = "자바 프로그래밍";
		
		System.out.println(str1.charAt(3));		// u
		System.out.println(str2.charAt(3));		// 프
		
		String ssn = "010624-3203125";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}

}
