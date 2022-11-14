package ch11.sec04_objects;

import java.util.Objects;

public class Student {
	int sno;
	String name;
	
	Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
//		return Objects.hash(sno);
		return Objects.hash(sno, name);
	}
}
