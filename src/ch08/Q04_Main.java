package ch08;

public class Q04_Main {

	public static void main(String[] args) {
		dbWork(new Q04_OracleDao());
		dbWork(new Q04_MySqlDao());
	}

	private static void dbWork(Q04_DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
