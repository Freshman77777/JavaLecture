package mysql.erd;

public class UserTest {

	public static void main(String[] args) {
		UsersDao dao = new UsersDao();
		
		dao.registerUser(new Users("admin", "admin", "관리자", "admin@mysql.com"));
		dao.registerUser(new Users("james", "james", "관리자", "james@mysql.com"));
		

	}

}
