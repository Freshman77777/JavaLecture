package ch10Ex11_userDefineException;

public class Main {

	public static void main(String[] args) {
		Account account = new account();
		
		// �����ϱ�
		account.deposit(10000);
		System.out.println("�ܰ�: "+account.getBalance());
		
		// ����ϱ�
		try {
			account.withdraw(5000);
		} catch (BalanceInsufficientExeption e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
