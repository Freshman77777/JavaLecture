package mysql.SoccerPlayer;

public class Init {

	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.createTable();
		
	dao.insertplayer(new player(1,"테어 슈테겐","골키퍼","1992-04-30","187",0));
	dao.insertplayer(new player(26,"이냐키 페냐","골키퍼","1999-03-02","184",0));
	dao.insertplayer(new player(36,"아르나우 테나스","골키퍼","2001-05-30","185",0));
	dao.insertplayer(new player(4,"로날드 아라우호","수비수","1999-03-07","191",0));
	dao.insertplayer(new player(14,"알레한드로 발데","수비수","2003-10-18","175",0));
	dao.insertplayer(new player(23,"쥘스 쿤데","수비수","1998-11-12","178",0));
	dao.insertplayer(new player(8,"페드리","미드필더","2002-11-25","174",0));
	dao.insertplayer(new player(21,"프랭키 더 용","미드필더","1997-05-12","180",0));
	dao.insertplayer(new player(30,"가비","미드필더","2004-08-05","173",0));
	dao.insertplayer(new player(9,"로베르트 레반도프스키","공격수","1988-08-21","185",0));
	dao.insertplayer(new player(10,"안수 파티","공격수","2002-10-31","187",0));
	dao.insertplayer(new player(22,"하피냐","공격수","1996-12-14","176",0));
	
	
	

	}

}
