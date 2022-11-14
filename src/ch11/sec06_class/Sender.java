package ch11.sec06_class;

public class Sender implements Action {

	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}

}
