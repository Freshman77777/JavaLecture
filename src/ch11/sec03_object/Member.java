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
			if (id.equals(member.id) && name.equals(member.name)) {		// id, name이 모두 같아야 true
//			if (id.equals(member.id)) {		// id만 같으면 true
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
