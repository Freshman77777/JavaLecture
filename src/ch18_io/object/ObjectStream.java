package ch18_io.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member m1 = new Member("fall", "¥‹«≥¿Ã");
		Product p1 = new Product("≥Î∆Æ∫œ", 1500000);
		int[] arr1 = {1, 2, 3};
		
		oos.writeObject(m1); oos.writeObject(p1); oos.writeObject(arr1);
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("/temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}
