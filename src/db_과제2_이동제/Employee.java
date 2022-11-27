package db_과제2_이동제;    // 메소드 재정의와 Set Collection

import java.time.LocalDate;
import java.util.Objects;

public class Employee {                 // 1.1-1 종업원 정보 사번(id), 이름(name), 직급(position), 입사일자(joinDate)
	private int id;
	private String name;
	private String position;
	private LocalDate joinDate;
	
	Employee() {}                //1.1-2 기본 생성자와 모든 종업원 정보를 매개변수로 갖는 생성자
	Employee(int id, String name, String position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	@Override                   // 1.1-3 Employee 클래스가 가지고 있는 정보를 문자열로 반환하는 toString() 메소드
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	@Override
	public int hashCode() {    // 1.1-4 사번과 이름으로 객체를 구분할 수 있는 hashCode()와 equals() 메소드
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee))
			return false;
		Employee target = (Employee) obj;
		return name.equals(target.name) && id == target.id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
}
	
	


