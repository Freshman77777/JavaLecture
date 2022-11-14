package ch06;

public class Ex12_Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	Ex12_Car() {}		// 기본 생성자, 생략하면 컴파일러가 만들어 준다.
	Ex12_Car(String company) {
		this(company, "그랜저", "검정색", 200);
	}
	Ex12_Car(String company, String model) {
		this(company, model, "검정색", 200);
	}
	Ex12_Car(String company, String model, String color) {
		this(company, model, color, 200);
	}
	Ex12_Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	void printField() {
		System.out.println(this.company + ", " + this.model + ", " +
				this.color + ", " + this.maxSpeed);
	}

	@Override
	public String toString() {
		return "Ex12_Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
}
