package ch11.sec07_string;

public class Ex12_Join {

	public static void main(String[] args) {
		String[] fruits = {"감", "밤", "귤", "배"};
		
		System.out.println(String.join(" ", fruits));
		System.out.println(String.join(", ", fruits));
		System.out.println(String.join(" - ", fruits));
	}

}
