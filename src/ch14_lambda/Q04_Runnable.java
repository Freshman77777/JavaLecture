package ch14_lambda;

public class Q04_Runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i=0; i<3; i++)
				System.out.println("�۾� �����尡 ����˴ϴ�.");
		});
		thread.start();
	}

}
