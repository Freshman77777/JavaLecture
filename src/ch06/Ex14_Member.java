package ch06;

public class Ex14_Member {
	private String uid;
	private String name;
	private String password;
	private int age;
	
	public Ex14_Member() {}
	public Ex14_Member(String uid, String name, String password, int age) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.age = age;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Ex14_Member [uid=" + uid + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
}
