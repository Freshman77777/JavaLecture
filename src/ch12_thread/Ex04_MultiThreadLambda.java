package ch12_thread;

import java.awt.Toolkit;

public class Ex04_MultiThreadLambda {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {		// Lambda ǥ����(ȭ��ǥ �Լ�)
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i=0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}
	}

}
