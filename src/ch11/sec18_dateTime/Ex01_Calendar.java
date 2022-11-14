package ch11.sec18_dateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex01_Calendar {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		Calendar now = Calendar.getInstance(tz);
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// month는 1 증가시켜주어야 함
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "-" + month + "-" + day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:			// 2
			strWeek = "월"; break;
		case Calendar.TUESDAY:			// 3
			strWeek = "화"; break;
		case Calendar.WEDNESDAY:		// 4
			strWeek = "수"; break;
		case Calendar.THURSDAY:			// 5
			strWeek = "목"; break;
		case Calendar.FRIDAY:			// 6
			strWeek = "금"; break;
		case Calendar.SATURDAY:			// 7
			strWeek = "토"; break;
		default:						// 1
			strWeek = "일";
		}
		System.out.println(strWeek);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = (amPm == Calendar.AM) ? "오전" : "오후";
		
		int hour = now.get(Calendar.HOUR);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(strAmPm + " " + hour + ":" + minute + ":" + second);
		System.out.println(hour24 + ":" + minute + ":" + second);
	}

}
