package mysql.customer;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		DAO dao = new DAO();
		Customer c1 = new Customer("admin","관리자",
							LocalDate.parse("2022-11-17"),0);
//		System.out.println(c1);
		
//		Customer c2 = new Customer("james","제임스");
//		dao.insertCustomer(c2);
		
		Customer c3 = dao.getCustomer("james");
		System.out.println(c3);
		System.out.println();
		
		c3.setName("재임수");
		c3.setRegDate(LocalDate.parse("2022-11-01"));
		dao.updateCustomer(c3);
		
		List<Customer> list = dao.getCustomers();
		for (Customer c: list)
			System.out.println(c);
	}

}