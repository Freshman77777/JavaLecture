package ch11.sec07_string;

public class Ex04_IndexOf {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		int index = str.indexOf("프로그래밍");
		System.out.println(index);
		
		// 찾고자 하는 문자열이 대상 문자열에 있는 경우 리턴 값은 0 이상임
		if (str.indexOf("자바") >= 0)
			System.out.println("자바 포함");
		else									// -1 을 리턴
			System.out.println("자바 불포함");
	}

}
