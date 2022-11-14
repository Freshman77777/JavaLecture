package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try - with - resources
 * 
 * try ()로 open한 resource를 자동으로 close 해줌
 */
public class Ex08_TryWithResource {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("Ex01_NullPointer.java")) {
			fis.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("Ex01_NullPointer.java");
//			fis.read();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
