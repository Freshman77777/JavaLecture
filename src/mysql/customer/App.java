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
			System.out.println("1.����� | 2.����� | 3.�������� | 4.��Ż�� | 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");
			
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
				System.out.println("Warning: 1���� 5������ ���ڸ� �Է��ϼ���.");
			}
		}
		System.out.println("���α׷� ����");
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
			System.out.println("�ߺ��� UID�Դϴ�. �ٽ� �Է��ϼ���.");
		}
		System.out.println("�̸�> ");
		String name = scan.nextLine();
		Customer nc = new Customer(uid, name);
		dao.insertCustomer(nc);
		System.out.println("�� ����� ���ƽ��ϴ�.");
	}
	
	public static void updateCustomer() {
		System.out.print("UID> ");
		String uid = scan.nextLine();
		Customer c = dao.getCustomer(uid);
		System.out.print("�̸�(" + c.getName() + ")> ");
		String name = scan.nextLine();
		System.out.print("�����(" + c.getRegDate().toString() +")> ");
		String regDate = scan.nextLine();
		c = new Customer(uid, name, LocalDate.parse(regDate), 0);
		dao.updateCustomer(c);
		System.out.println("������ ������ ���ƽ��ϴ�.");
	}
	
	public static void deleteCustomer() {
		System.out.print("UID> ");
		String uid = scan.nextLine();
		dao.deleteCustomer(uid);
		System.out.println("�� Ż�� ���ƽ��ϴ�.");
	}
}