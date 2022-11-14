package ch11.sec06_class;

public class Ex03_NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = null;
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		if (time % 2 == 0)
			clazz = Class.forName("ch11.sec06_class.Sender");
		else
			clazz = Class.forName("ch11.sec06_class.Receiver");
		
		Action action = (Action) clazz.newInstance();
		action.execute();
	}

}
