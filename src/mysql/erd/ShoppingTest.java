package mysql.erd;

public class ShoppingTest {

	public static void main(String[] args) {
		ShoppingDao dao = new ShoppingDao();
		
		Order order = dao.getOrder(101);
		System.out.println(order);
		for (Cart c: order.getCartSet())
			System.out.println(c.getPname() + ": " + c.getQuantity() + " * " + c.getPrice());
	}

}