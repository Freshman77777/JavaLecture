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
			System.out.println("1.선수목록 | 2.선수등록 | 3.정보수정 | 4.선수탈퇴 | 5.종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택> ");
			
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
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
	}

	public static void listPlayers() {
		List<Player> list = dao.getPlayers();
		for (Player p: list)
			System.out.println(p);
	}
	
	public static void registerPlayer() {
		int backNumber;
		while (true) {
			System.out.print("등번호> ");
			backNumber = Integer.parseInt(scan.nextInt());
			Player p = dao.getPlayer(backNumber);
			if (p.getName() == null)
				break;
			System.out.println("중복된 등번호입니다. 다시 입력하세요.");
		}
		System.out.println("이름>");
		String name = scan.nextLine();
		System.out.println("포지션>");
		String position = scan.nextLine();
		System.out.println("생년월일>");
		String birDate = scan.nextLine();
		System.out.println("신장>");
		int height = Integer.parseInt(scan.nextLine());
		Player p = new Player(backNumber, name, position, birDate, height, 0);
		dao.insertPlayer(p);
		System.out.println("선수 등록을 마쳤습니다.");		
	}
	
	public static void updatePlayer() {
		System.out.print("등번호> ");
		int backNumber = scan.nextInt();
		Player p = dao.getPlayer(backNumber);
		
		System.out.print("이름(" + p.getName() + ")> ");
		String name = scan.nextLine();
		name = (name.length() == 0) ? p.getName() : name;
		
		System.out.println("포지션(" +p.getPosition() + ")> ");
		String position = scan.nextLine();
		position = (position.length() == 0) ? p.getPosition().toString() : position;
		
		System.out.print("생년월일(" + p.getBirDate()+")> ");
		String birDate = scan.nextLine();
		birDate = (birDate.length() == 0) ? 
		
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