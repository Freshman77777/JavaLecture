package ch11.sec03_object;

public class Ex01_EqualsMain {

	public static void main(String[] args) {
		Member member1 = new Member("hong", "홍길동");
		Member member2 = new Member("hong", "홍자바");
		Member member3 = new Member("hong", "홍길동");
		
		// Member에서 equals method를 재정의하기 이전
		System.out.println(member1.equals(member3));	// 아래 결과와 동일
		System.out.println(member1 == member3);		// 참조하는 주소가 같으냐를 비교
		
		// Member class에서 id만 같으면 동일하다고 한 경우
		System.out.println(member1.equals(member3));
		System.out.println(member1.equals(member2));
		
		// Member class에서 id와 name이 같아야 동일하다고 한 경우
		System.out.println(member1.equals(member3));
		System.out.println(member1.equals(member2));
		
		System.out.println(member1);
		System.out.println(member2);
	}

}
