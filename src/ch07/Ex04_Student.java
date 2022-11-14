package ch07;

public class Ex04_Student extends Ex04_Person {
	String major;
	
	Ex04_Student(String name, String gender, int age, String major) {
		super(name, gender, age);
		this.major = major;
	}

	void study() {
		System.out.println("공부를 합니다.");
	}

	@Override
	public String toString() {
		return "Ex04_Student [major=" + major + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
