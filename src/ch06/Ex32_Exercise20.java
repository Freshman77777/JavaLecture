package ch06;

import java.util.Scanner;

public class Ex32_Exercise20 {
	private static Ex32_Account[] accountArray = new Ex32_Account[100];
	private static Scanner scan = new Scanner(System.in);
	private static int index = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				createAccount(); break;
			case 2:
				accountList(); break;
			case 3:
				deposit(); break;
			case 4:
				withdraw(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void withdraw() {
		System.out.println("-----------------");
		System.out.println("출금");
		System.out.println("-----------------");
		
		System.out.print("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("출금액> ");
		int amount = Integer.parseInt(scan.nextLine());
		Ex32_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		
		int balance = account.getBalance() - amount;
		if (balance >= 0) {
			account.setBalance(balance);
			System.out.println("출금이 완료되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	private static void deposit() {
		System.out.println("-----------------");
		System.out.println("입금");
		System.out.println("-----------------");
		
		System.out.print("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("입금액> ");
		int amount = Integer.parseInt(scan.nextLine());
		Ex32_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		
		account.setBalance(account.getBalance() + amount);
		System.out.println("입금이 완료되었습니다.");
	}
	
	private static Ex32_Account findAccount(String ano) {
		for (Ex32_Account acc: accountArray) {
			if (acc == null)
				break;
			if (ano.equals(acc.getAno()))
				return acc;
		}
		return null;
	}
	
	private static void accountList() {
		System.out.println("-----------------");
		System.out.println("계좌 목록");
		System.out.println("-----------------");
		
		for (int i = 0; i < index; i++) {
			System.out.printf("%8s", accountArray[i].getAno());
			System.out.printf("%8s", accountArray[i].getOwner());
			System.out.printf("%,12d%n", accountArray[i].getBalance());
		}
	}
	
	private static void createAccount() {
		System.out.println("-----------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------");
		
		String ano = (1001 + index) + "";
		System.out.print("계좌주 이름> ");
		String owner = scan.nextLine();
		System.out.print("최초 입금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		
		accountArray[index++] = new Ex32_Account(ano, owner, balance);
		System.out.println("계좌가 생성되었습니다.");
	}
}
