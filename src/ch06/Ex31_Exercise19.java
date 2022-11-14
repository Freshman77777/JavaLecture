package ch06;

public class Ex31_Exercise19 {

	public static void main(String[] args) {
		Ex31_Account account = new Ex31_Account();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	}

}
