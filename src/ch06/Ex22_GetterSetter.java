package ch06;

public class Ex22_GetterSetter {
	private int number;
	private boolean success;
	private boolean acceptable;
	private String name;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {	// number는 100 이상 1000 미만
		if (number >= 100 && number < 1000) {
			this.number = number;
			success = true;
			return;
		}
		success = false;
	}
	public boolean isSuccess() {	// number가 수정되면 true 아니면 false를 리턴
		return success;
	}
	
	public boolean isAcceptable() {		// boolean인 경우에는 is로 시작함
		return acceptable;
	}
	public void setAcceptable(boolean acceptable) {
		this.acceptable = acceptable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Ex22_GetterSetter [number=" + number + ", success=" + success + ", acceptable=" + acceptable + ", name="
				+ name + "]";
	}
}
