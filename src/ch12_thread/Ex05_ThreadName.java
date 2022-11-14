package ch12_thread;

public class Ex05_ThreadName {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Main 쓰레드 이름: " + mainThread.getName());
		
		Thread threadA = new Ex05_ThreadA();		// Thread A 생성
		System.out.println("작업 쓰레드 이름: " + threadA.getName());
		threadA.start();							// Thread A 시작
		
		Thread threadB = new Ex05_ThreadB();
		System.out.println("작업 쓰레드 이름: " + threadB.getName());
		threadB.start();
	}

}
