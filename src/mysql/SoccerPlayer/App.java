package mysql.SoccerPlayer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
	private static Scanner scan = new Scanner(System.in);
	private static DAO dao = new DAO();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.���� ��� | 2.���� ��� | 3.�������� ���� | 4.���� ���� | 5.����");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				listPlayers(); break;
			case 2:
				registerPlayer(); break;
			case 3:
				updatePlayer(); break;
			case 4:
				deletePlayer(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1���� 5������ ���ڸ� �Է��ϼ���.");
			}
		}
		System.out.println("���α׷� ����");
	}

	public static void listPlayers() {
		List<Player> list = dao.getPlayers();
		for (Player p: list)
			System.out.println(p);
	}
	
	public static void registerPlayer() {
		int backNumber = null;
		while (true) {
			System.out.print("���ȣ> ");
			backNumber = scan.nextInt();
			Player p = dao.getPlayer(backNumber);
			if (p.getBackNumber() == null)
				break;
			System.out.println("�ߺ��� ���ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
		}
		System.out.println("������> ");
		String name = scan.nextLine();
		Player pd = new Player(backNumber, name);
		dao.insertPlayer(pc);
		System.out.println("���� ����� ���ƽ��ϴ�.");
	}
	
	public static void updatePlayer() {
		System.out.print("���ȣ> ");
		int backNumber = scan.nextInt();
		Player p = dao.getPlayer(backNumber);
		System.out.print("������(" + p.getName() + ")> ");
		String name = scan.nextLine();
		System.out.println("������(" +p.getPosition() + ")> ");
		String position = scan.nextLine();
		System.out.print("�������(" + p.getBirDate().toString() +")> ");
		String birDate = scan.nextLine();
		System.out.println("Ű>");
		int height = scan.nextInt();
		p = new Player(backNumber, name, position, birDate , height,  0);
		dao.updatePlayer(p);
		System.out.println("�������� ������ ���ƽ��ϴ�.");
	}
	
	public static void deletePlayer() {
		System.out.print("���ȣ> ");
		int backNumber = scan.nextInt();
		dao.deletePlayer(backNumber);
		System.out.println("���������� ���ƽ��ϴ�.");
	}
}