package ch13_generic.sec05_restricted;

public class Main {

	public static void main(String[] args) {
		int result = Util.compare(10, 20);
		System.out.println(result);
		
		System.out.println(Util.compare(5.5, 5.5));
		System.out.println(Util.compare(4.5, 3));
	}

}
