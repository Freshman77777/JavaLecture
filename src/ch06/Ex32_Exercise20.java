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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");
			
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
				System.out.println("Warning: 1���� 5������ ���ڸ� �Է��ϼ���.");
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void withdraw() {
		System.out.println("-----------------");
		System.out.println("���");
		System.out.println("-----------------");
		
		System.out.print("���� ��ȣ> ");
		String ano = scan.nextLine();
		System.out.print("��ݾ�> ");
		int amount = Integer.parseInt(scan.nextLine());
		Ex32_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���¹�ȣ�� Ȯ���ϼ���.");
			return;
		}
		
		int balance = account.getBalance() - amount;
		if (balance >= 0) {
			account.setBalance(balance);
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	private static void deposit() {
		System.out.println("-----------------");
		System.out.println("�Ա�");
		System.out.println("-----------------");
		
		System.out.print("���� ��ȣ> ");
		String ano = scan.nextLine();
		System.out.print("�Աݾ�> ");
		int amount = Integer.parseInt(scan.nextLine());
		Ex32_Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���¹�ȣ�� Ȯ���ϼ���.");
			return;
		}
		
		account.setBalance(account.getBalance() + amount);
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
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
		System.out.println("���� ���");
		System.out.println("-----------------");
		
		for (int i = 0; i < index; i++) {
			System.out.printf("%8s", accountArray[i].getAno());
			System.out.printf("%8s", accountArray[i].getOwner());
			System.out.printf("%,12d%n", accountArray[i].getBalance());
		}
	}
	
	private static void createAccount() {
		System.out.println("-----------------");
		System.out.println("���� ����");
		System.out.println("-----------------");
		
		String ano = (1001 + index) + "";
		System.out.print("������ �̸�> ");
		String owner = scan.nextLine();
		System.out.print("���� �Աݾ�> ");
		int balance = Integer.parseInt(scan.nextLine());
		
		accountArray[index++] = new Ex32_Account(ano, owner, balance);
		System.out.println("���°� �����Ǿ����ϴ�.");
	}
}
