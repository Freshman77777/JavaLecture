package ch11.sec07_string;

import java.io.UnsupportedEncodingException;

public class Ex03_GetBytes {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요?";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);			// 16 (UTF-8 encoding 되어 있음)
		String strFromByteArray = new String(bytes1);
		System.out.println(strFromByteArray);		// 안녕하세요?
		System.out.println();
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);
		strFromByteArray = new String(bytes2, "EUC-KR");
		System.out.println(strFromByteArray);		// 안녕하세요?
		System.out.println();
	}

}
