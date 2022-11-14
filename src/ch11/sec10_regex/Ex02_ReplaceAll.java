package ch11.sec10_regex;

import java.util.Arrays;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		String data = "³ª´Â Java ProgrammingÀÌ ÁÁ¾Æ¿ä!!!";
		System.out.println(data.replaceAll("[A-Z]", ""));	// ´ë¹®ÀÚ Á¦°Å
		System.out.println(data.replaceAll("[a-z]", ""));	// ¼Ò¹®ÀÚ Á¦°Å
		System.out.println(data.replaceAll("[^°¡-ÆR ]", ""));	// ÇÑ±Û°ú °ø¹é¸¸ ³²±â°í ¸ðµÎ Á¦°Å
		
		data = System.getenv("JAVA_HOME");
		System.out.println(data);
		String[] arr = data.split("\\\\");		// PatternÀ¸·Î \\À» »ç¿ëÇØ¾ß µÇ±â ¶§¹®
		System.out.println(Arrays.toString(arr));
	}

}
