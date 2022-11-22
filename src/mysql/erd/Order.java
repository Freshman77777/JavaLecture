package mysql.erd;

import java.time.LocalDateTime;
import java.util.Set;

public class Order {
	private int oid;
	private LocalDateTime orderDate;
	private int totalPrice;
	private String uid;
	private Set<Cart> cartSet;
	
	Order() { }
	Order(int oid, LocalDateTime orderDate, int totalPrice, String uid, Set<Cart> cartSet) {
		super();
		this.oid = oid;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.uid = uid;
		this.cartSet = cartSet;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", orderDate=" + orderDate.toString().substring(2,16).replace("T", " ") 
				+ ", totalPrice=" + totalPrice + ", uid=" + uid + "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Set<Cart> getCartSet() {
		return cartSet;
	}
	public void setCartSet(Set<Cart> cartSet) {
		this.cartSet = cartSet;
	}
}