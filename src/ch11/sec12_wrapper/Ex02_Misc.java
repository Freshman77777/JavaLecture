package ch11.sec12_wrapper;

public class Ex02_Misc {

	public static void main(String[] args) {
		Double d = Double.parseDouble("3.14");
		Integer i = Integer.parseInt("300");
		Integer k = 300;
		
		System.out.println(i == k);		// -128 ~ 127 까지만 사용 가능
		System.out.println(i.equals(k));
	}

}
