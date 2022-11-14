package ch06;

import java.time.LocalDate;

import ch04.Ex24_Diamond;

public class Ex21_Package {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		Exercise ex06 = new Exercise();		// ch06 package
		ch05.Exercise ex05 = new ch05.Exercise();	// ch05 package
		Ex24_Diamond diamond = new Ex24_Diamond();
	}

}
