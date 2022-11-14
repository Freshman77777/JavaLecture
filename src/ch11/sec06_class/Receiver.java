package ch11.sec06_class;

public class Receiver implements Action {

	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}

}
