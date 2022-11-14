package ch08;

public class Q05_Main {

	public static void main(String[] args) {
		Q05_Action action = new Q05_Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}

}
