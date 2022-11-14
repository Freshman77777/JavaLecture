package ch15_collection.advanced;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private Position positon;
	private LocalDate joinDate;
	Employee(int id, String name, Position positon, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.positon = positon;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Position getPositon() {
		return positon;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", positon=" + positon + ", joinDate=" + joinDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name );
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee e =(Employee) obj;
		return id ==e.getId() && name.equals(e.getName());
	}
	
}


