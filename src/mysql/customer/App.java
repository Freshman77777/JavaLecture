package mysql.customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
	private static Scanner scan = new Scanner(System.in);
	private static DAO dao = new DAO();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.고객목록 | 2.고객등록 | 3.정보수정 | 4.고객탈퇴 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				listCustomers(); break;
			case 2:
				registerCustomer(); break;
			case 3:
				updateCustomer(); break;
			case 4:
				deleteCustomer(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void listCustomers() {
		List<Customer> list = dao.getCustomers();
		for (Customer c: list)
			System.out.println(c);
	}
	
	public static void registerCustomer() {
		String uid = null;
		while (true) {
			System.out.print("UID> ");
			uid = scan.nextLine();
			Customer c = dao.getCustomer(uid);
			if (c.getUid() == null)
				break;
			System.out.println("중복된 UID입니다. 다시 입력하세요.");
		}
		System.out.println("이름> ");
		String name = scan.nextLine();
		Customer nc = new Customer(uid, name);
		dao.insertCustomer(nc);
		System.out.println("고객 등록을 마쳤습니다.");
	}
	
	public static void updateCustomer() {
		System.out.print("UID> ");
		String uid = scan.nextLine();
		Customer c = dao.getCustomer(uid);
		System.out.print("이름(" + c.getName() + ")> ");
		String name = scan.nextLine();
		System.out.print("등록일(" + c.getRegDate().toString() +")> ");
		String regDate = scan.nextLine();
		c = new Customer(uid, name, LocalDate.parse(regDate), 0);
		dao.updateCustomer(c);
		System.out.println("고객정보 수정을 마쳤습니다.");
	}
	
	public static void deleteCustomer() {
		System.out.print("UID> ");
		String uid = scan.nextLine();
		dao.deleteCustomer(uid);
		System.out.println("고객 탈퇴를 마쳤습니다.");
	}
}