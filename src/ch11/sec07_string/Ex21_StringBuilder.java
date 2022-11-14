package ch11.sec07_string;

public class Ex21_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();		// ""
		
		sb.append("Java ");					// "Java "
		sb.append("Program Study");			// "Java Program Study"
		System.out.println(sb.toString());
		
		sb.insert(4, 2);					// "Java2 Program Study"
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');				// "Java6 Program Study"
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");			// "Java6 Book Study"
		System.out.println(sb.toString());
		
		sb.delete(4, 5);					// "Java Book Study"
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse().toString());
	}

}
