package ch18_io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03_copy {

	public static void main(String[] args) throws IOException {
		String srcFile = "/Users/theink/Pictures/������.PNG";
		String dstFile = "/Temp/������.PNG";
		
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(dstFile);
		
		byte[] data = new byte[1024];
		while (true) {
			int num = is.read(data);
			if (num == -1)
				break;
			os.write(data, 0, num);
		}
		
		os.flush();
		os.close();
		is.close();
		System.out.println("���簡 �� �Ǿ����ϴ�.");

	}

}
