package mysql.bbs;

import java.time.LocalDate;

public class Users {
	private String uid;
	private String pwd;
	private String uname;
	private String email;
	private LocalDate regDate;
	
	Users() {}
	Users(String uid, String pwd, String uname, String email) {
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
	}
	Users(String uid, String pwd, String uname, String email, LocalDate regDate) {
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Users [" + uid + ", " + pwd + ", " + uname + ", " + email + ", " + regDate
				+ "]";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}