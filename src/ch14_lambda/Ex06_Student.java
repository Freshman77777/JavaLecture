package ch14_lambda;

public class Ex06_Student {
	private String name;
	private int engScore;
	private int mathScore;
	
	Ex06_Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	@Override
	public String toString() {
		return "Ex06_Student [name=" + name + ", engScore=" + engScore + ", mathScore=" + mathScore + "]";
	}
}
