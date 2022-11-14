package ch11.sec05_system;

import java.util.Map;

public class Ex03_Env {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
		
		for (Map.Entry<String,String> entry: System.getenv().entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue());
	}

}
