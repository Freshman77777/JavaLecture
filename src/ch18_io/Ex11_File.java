package ch18_io;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex11_File {

	public static void main(String[] args) throws Exception {
		File dir = new File("/temp/images");
		File file1 = new File("/temp/file1.txt");
		File file2 = new File("/temp/file2.txt");
		File file3 = new File("/temp/file3.txt");
		
		// 존재하지 않으면 디렉토리 또는 파일 생성
		if (!dir.exists()) dir.mkdirs();
		if (!file1.exists()) file1.createNewFile();
		if (!file2.exists()) file2.createNewFile();
		if (!file3.exists()) file3.createNewFile();
		
		// Temp 디렉토리 내용
		File temp = new File("/temp");
		File[] contents = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file: contents) {
			System.out.printf("%-22s", sdf.format(file.lastModified()));
			if (file.isDirectory())
				System.out.printf("%-10s  %-20s", "<DIR>", file.getName());
			else
				System.out.printf("%,10d  %-20s", file.length(), file.getName());
			System.out.println();
		}
	}

}
