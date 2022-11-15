package ch18_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07_BufferedIO {

	public static void main(String[] args) throws IOException {
		// Case 1) 입출력 스트림으로 복사
		FileInputStream fis = new FileInputStream("/temp/forest1.jpg");
		FileOutputStream fos = new FileOutputStream("/temp/target1.jpg");
		
		// Case 2) 입출력 스트림 + 버퍼 스트림으로 복사
		FileInputStream fis2 = new FileInputStream("/temp/forest2.jpg");
		FileOutputStream fos2 = new FileOutputStream("/temp/target2.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 버퍼를 사용하지 않고 복사
		long noBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용: " + noBufferTime + " ns");
		
		// 버퍼를 사용하여 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용: " + bufferTime + " ns");
		
		System.out.println(noBufferTime / bufferTime);
		
		fis.close(); fos.close(); fis2.close(); fos2.close();
		bis.close(); bos.close();
	}

	public static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();
		// 1 바이트 단위로 읽고 쓰기
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}
