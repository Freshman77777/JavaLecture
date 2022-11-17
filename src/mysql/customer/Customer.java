package mysql.customer;

import java.time.LocalDate;

/**
 * DTO(Data Transfer Object)
 */
public class Customer {
	private String uid;
	private String name;
	private LocalDate regDate;
	private int isDeleted;
	
	Customer() {}
	Customer(String uid, String name, LocalDate regDate, int isDeleted) {
		super();
		this.uid = uid;
		this.name = name;
		this.regDate = regDate;
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "Customer [" + uid + ", " + name + ", " + regDate + ", " + isDeleted + "]";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}