package ch10Ex11_userDefineException;

public class Main {

	public static void main(String[] args) {
		Account account = new account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("잔고: "+account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(5000);
		} catch (BalanceInsufficientExeption e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
