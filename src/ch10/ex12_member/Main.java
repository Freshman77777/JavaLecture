package ch10.ex12_member;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new ArrayMemberService();
		memberService.register("kim", "9876", "���ڹ�");
		memberService.register("hong", "12345", "ȫ�浿");
		memberService.register("park", "1234", "���ڹ�");
		memberService.printAllMembers();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵�: ");
		String id = scan.nextLine();
		System.out.print("�н�����: ");
		String password = scan.nextLine();
		scan.close();
	
		try {
			boolean result = memberService.login(id, password);
			if (result) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				memberService.logout(id);
			}
//		} catch (NotExistIdException | WrongPasswordException e) {
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}
}
