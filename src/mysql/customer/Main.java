package mysql.customer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		DAO dao = new DAO();
		Customer c1 = new Customer("admin","°ü¸®ÀÚ",
							LocalDate.parse("2022-11-17"),0);
		System.out.println(c1);
		
		dao.insertCustomer(c1);
	}

}

