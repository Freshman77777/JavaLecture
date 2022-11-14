package ch11.sec18_DateTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04_Operation {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 
		LocalDateTime target = now		// method chaining
				.plusYears(3)
				.minusMonths(8)
				.minusDays(3)
				.minusHours(2)
				.plusMinutes(10);
		System.out.println(target);
		
		// 
		target = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(target);
		target = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));	// �룎�븘�삤�뒗 �썡�슂�씪
		System.out.println(target);
		target = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));	// �씠踰덈떖�쓽 泥� �씪�슂�씪
		System.out.println(target);
	}

}
