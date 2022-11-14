package ch10.ex12_member;

public class ArrayMemberService implements MemberService {
	private Member[] members = new Member[10];
	
	@Override
	public void register(String id, String password, String name) {
		Member member = findById(id);
		if (member != null)	{		// ������ id�� �̹� ������
			System.out.println("id�� �ߺ��Ǿ����ϴ�.");
			return;
		}
		member = new Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break;
			}
		}
	}

	@Override
	public void printAllMembers() {
		for (Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}
	}

	@Override
	public Member findById(String id) {
		for (Member member : members) {
			if (member == null)		// id �� �ش��ϴ� member�� ��ã�� ������ �� ���
				break;
			if (id.equals(member.getId()))		// id�� �ش��ϴ� member�� ã�� ���
				return member;
		}
		return null;
	}

	@Override
//	public boolean login(String id, String password) throws NotExistIdException, WrongPasswordException {
	public boolean login(String id, String password) throws RuntimeException {
		Member member = findById(id);
		if (member == null)			// id�� �ش��ϴ� member�� ���� ���
			throw new NotExistIdException("ID " + id + "��/�� �����ϴ�.");
//			return false;				
		else {						// id�� �ش��ϴ� member�� ã�� ���
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "�� ȯ���մϴ�.");
				return true;
			} else					// �н����尡 Ʋ�� ���
				throw new WrongPasswordException("�н����尡 Ʋ�Ƚ��ϴ�.");
//				return false;
		}
	}

	@Override
	public void logout(String id) {
		Member member = findById(id);
		System.out.println(member.getName() + "�� �α׾ƿ� �Ǽ̽��ϴ�.");
	}
}
