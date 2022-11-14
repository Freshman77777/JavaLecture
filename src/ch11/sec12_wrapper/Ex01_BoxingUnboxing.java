package ch11.sec12_wrapper;

public class Ex01_BoxingUnboxing {

	public static void main(String[] args) {
		// Boxing
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = new Integer("200");		// Deprecated
		Integer obj3 = 300;			// ÀÚµ¿ ¹Ú½Ì
		
		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2;			// ÀÚµ¿ ¾ð¹Ú½Ì
		int value3 = obj3;
		
		System.out.println(value1 + ", " + value2 + ", " + value3);
		System.out.println(obj1.toString());
	}
}
