package ch12_thread;

public class Q02_Main {

	public static void main(String[] args) {
		Thread thread1 = new Q02_MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new Q02_MusicRunnable());
		thread2.start();
	}

}
