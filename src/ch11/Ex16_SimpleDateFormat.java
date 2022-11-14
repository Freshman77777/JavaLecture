package ch11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Ex16_SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss��");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println(sdf.format(now));
	}

}
