package mysql.SoccerPlayer;

import java.time.LocalDate;
import java.util.List;

import mysql.customer.Customer;

public class Main {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		Player p1 = new Player(8,"��帮","�̵��ʴ�",LocalDate.parse("2002-11-25"),174,0);
		
				
				
		List<Player> list = dao.getPlayers();
		for (Player p: list)
			System.out.println(p);		
	}
}

