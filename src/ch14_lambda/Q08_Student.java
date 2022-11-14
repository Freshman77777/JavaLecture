package ch14_lambda;

public class Q08_Student {
	private String name;
	private int engScore;
	private int mathScore;
	
	Q08_Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	public String getName() {
		return name;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
}
