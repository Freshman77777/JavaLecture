package ch06;

import java.util.Scanner;

public class Ex41_Exercise15 {

	public static void main(String[] args) {
		Ex41_MemberService memberService = new Ex41_MemberService();
		memberService.register("kim", "9876", "���ڹ�");
		memberService.register("hong", "12345", "ȫ�浿");
		memberService.register("hong", "1234", "ȫ�ڹ�");
		memberService.printAllMembers();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵�: ");
		String id = scan.nextLine();
		System.out.print("�н�����: ");
		String password = scan.nextLine();
		boolean result = memberService.login(id, password);
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout(id);
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
