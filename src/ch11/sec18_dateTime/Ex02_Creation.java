package ch11.sec18_dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Ex02_Creation {

	public static void main(String[] args) throws InterruptedException {
		// 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate examDay = LocalDate.of(2022, 11, 17);
		System.out.println(examDay);
		
		// 시간
		LocalTime curTime = LocalTime.now();
		System.out.println(curTime);
		LocalTime lunchTime = LocalTime.of(11, 50);
		System.out.println(lunchTime);
		
		// 날짜+시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDateTime christmas = LocalDateTime.of(2022, 12, 25, 0, 0);
		System.out.println(christmas);
		
		// Timezone
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDateTime);
		
		// Timestamp
		Instant is1 = Instant.now();
		Thread.sleep(10);
		Instant is2 = Instant.now();
		System.out.println(is1.until(is2, ChronoUnit.NANOS));
		System.out.println(is1.isBefore(is2));
		System.out.println(is1.isAfter(is2));
	}

}
