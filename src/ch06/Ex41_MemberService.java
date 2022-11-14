package ch06;

public class Ex41_MemberService {
	private Ex41_Member[] members = new Ex41_Member[10];
	
	void register(String id, String password, String name) {
		Ex41_Member member = findById(id);
		if (member != null)	{		// ������ id�� �̹� ������
			System.out.println("id�� �ߺ��Ǿ����ϴ�.");
			return;
		}
		member = new Ex41_Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break;
			}
		}
	}
	
	void printAllMembers() {
		for (Ex41_Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}
	}
	
	Ex41_Member findById(String id) {
		for (Ex41_Member member : members) {
			if (member == null)		// id �� �ش��ϴ� member�� ��ã�� ������ �� ���
				break;
			if (id.equals(member.getId()))		// id�� �ش��ϴ� member�� ã�� ���
				return member;
		}
		return null;
	}
	
	boolean login(String id, String password) {
		Ex41_Member member = findById(id);
		if (member == null)			// id�� �ش��ϴ� member�� ���� ���
			return false;				
		else {						// id�� �ش��ϴ� member�� ã�� ���
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "�� ȯ���մϴ�.");
				return true;
			} else					// �н����尡 Ʋ�� ���
				return false;
		}
	}
	
	void logout(String id) {
		Ex41_Member member = findById(id);
		System.out.println(member.getName() + "�� �α׾ƿ� �Ǽ̽��ϴ�.");
	}
}