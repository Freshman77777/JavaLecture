package ch11.sec07_string;

public class Ex08_Trim {

	public static void main(String[] args) {
		String oldStr = "\t   �ڹ� ���α׷���  \t \r\n";
		String newStr = oldStr.trim();
		
		System.out.println(newStr);
		System.out.println(newStr.length());
	}

}
