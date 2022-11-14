package ch11.sec03_object;

public class Member {
	String id;
	String name;
	
	Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id) && name.equals(member.name)) {		// id, name�� ��� ���ƾ� true
//			if (id.equals(member.id)) {		// id�� ������ true
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
}
