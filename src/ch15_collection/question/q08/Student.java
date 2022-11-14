package ch15_collection.question.q08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;		// Objects.hash(studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) 
			return false;
		Student student = (Student) obj;
		return studentNum == student.studentNum;
	}
}