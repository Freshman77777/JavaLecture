package ch06;

public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Member member = new Ex14_Member();
		member.setUid("admin");
		System.out.println(member.getUid());
		
		member = new Ex14_Member("admin","운영자","1234",30);
		System.out.println(member.toString());
	}

}
