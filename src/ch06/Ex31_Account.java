package ch06;

public class Ex31_Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		// �� Account�� total balance�� 0 �̻� 100�� ����
//		if (balance+this.balance >= MIN_BALANCE && balance+this.balance <= MAX_BALANCE)
//			this.balance += balance;
		// �Ű����� balance�� 0 �̻� 100�� ����
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance += balance;
	}
}
