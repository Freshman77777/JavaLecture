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
		// Case 1) ����� ��Ʈ������ ����
		FileInputStream fis = new FileInputStream("/temp/forest1.jpg");
		FileOutputStream fos = new FileOutputStream("/temp/target1.jpg");
		
		// Case 2) ����� ��Ʈ�� + ���� ��Ʈ������ ����
		FileInputStream fis2 = new FileInputStream("/temp/forest2.jpg");
		FileOutputStream fos2 = new FileOutputStream("/temp/target2.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// ���۸� ������� �ʰ� ����
		long noBufferTime = copy(fis, fos);
		System.out.println("���� �̻��: " + noBufferTime + " ns");
		
		// ���۸� ����Ͽ� ����
		long bufferTime = copy(bis, bos);
		System.out.println("���� ���: " + bufferTime + " ns");
		
		System.out.println(noBufferTime / bufferTime);
		
		fis.close(); fos.close(); fis2.close(); fos2.close();
		bis.close(); bos.close();
	}

	public static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();
		// 1 ����Ʈ ������ �а� ����
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
