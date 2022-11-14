package ch10.ex11_userDefineException;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		
		// �����ϱ�
		account.deposit(100000);
		System.out.println("�ܰ�: " + account.getBalance());
		
		// ����ϱ�
		try {
			account.withdraw(150000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("�ܰ�: " + account.getBalance());
		}
	}
}
