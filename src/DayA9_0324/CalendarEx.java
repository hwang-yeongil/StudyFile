package DayA9_0324;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"};
		
		Calendar today = Calendar.getInstance();
		
//		System.out.println("이 해의 년도 : "+ today.get(Calendar.YEAR));
//		System.out.println("월 : "+today.get(Calendar.MONTH));
//		System.out.println("이 해의 몇째주 : "+today.get(Calendar.WEEK_OF_YEAR));
//		System.out.println("이 달의 몇째주 : "+today.get(Calendar.WEEK_OF_MONTH));
//		System.out.println("이 달의 몇일 : "+today.get(Calendar.DATE));
//		System.out.println(today.get(Calendar.DAY_OF_MONTH));
//		System.out.println(today.get(Calendar.DAY_OF_YEAR));

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
//		date1.set(2015, Calendar.AUGUST, 15);
		date1.set(2015, 7, 15);
		System.out.println(toString(date1)+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일");
		System.out.println(toString(date2)+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("그 날 (date1)부터 지금(date2)까지" +difference+"초가 지남");
		System.out.println("일(day)로 계산하면 "+ difference/(24*60*60)+"일입니다");
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일 ";
	}
}
