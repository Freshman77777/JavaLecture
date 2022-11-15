package ch17_stream;

public class Ex14_Student {
	private String name;
	private String gender;
	private int score;
	
	Ex14_Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getScore() {
		return score;
	}
}