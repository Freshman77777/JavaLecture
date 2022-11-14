package ch12_thread;

public class Ex05_ThreadName {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Main ������ �̸�: " + mainThread.getName());
		
		Thread threadA = new Ex05_ThreadA();		// Thread A ����
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();							// Thread A ����
		
		Thread threadB = new Ex05_ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
	}

}
