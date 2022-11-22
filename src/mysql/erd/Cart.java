package mysql.erd;

import java.util.Objects;

public class Cart {
	private int oid;
	private int pid;
	private int quantity;
	private String pname;
	private int price;
	
	Cart() { }
	Cart(int oid, int pid, int quantity, String pname, int price) {
		this.oid = oid;
		this.pid = pid;
		this.quantity = quantity;
		this.pname = pname;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(oid, pid);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cart))
			return false;
		Cart c = (Cart) obj;
		return oid == c.getOid() && pid == c.getPid();
	}
	@Override
	public String toString() {
		return "Cart [" + oid + ", " + pid + ", " + quantity + ", " + pname + ", " + price
				+ "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}