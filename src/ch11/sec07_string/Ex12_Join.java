package ch11.sec07_string;

public class Ex12_Join {

	public static void main(String[] args) {
		String[] fruits = {"°¨", "¹ã", "±Ö", "¹è"};
		
		System.out.println(String.join(" ", fruits));
		System.out.println(String.join(", ", fruits));
		System.out.println(String.join(" - ", fruits));
	}

}
