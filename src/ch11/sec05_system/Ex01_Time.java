package ch11.sec05_system;

public class Ex01_Time {

	public static void main(String[] args) {
		long milliTime = System.currentTimeMillis();	// 1970-01-01 00:00:00 기준
		System.out.println(milliTime);
		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i=1; i<=100000; i++)
			sum += i;
		
		long time2 = System.nanoTime();
		
		System.out.println("1~100000 합: " + sum);
		System.out.println("소요 시간: " + (time2-time1) + " 나노초");
	}

}
