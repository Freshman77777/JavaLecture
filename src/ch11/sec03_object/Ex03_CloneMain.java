package ch11.sec03_object;

public class Ex03_CloneMain {

	public static void main(String[] args) {
		Customer original = new Customer("hong","ȫ�浿",25,true);
		
		Customer cloned = original.getCustomer();
		cloned.age = 30;
		cloned.name = "ȫ�ڹ�";
		
		System.out.println(original);
		System.out.println(cloned);
	}

}
