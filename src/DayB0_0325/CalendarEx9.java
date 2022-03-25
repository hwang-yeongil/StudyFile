package DayB0_0325;

import java.time.LocalDate;

public class CalendarEx9 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();

		// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
		// 연도, 월(문자열, 숫자), 일, 일(year 기준), 요일(문자열, 숫자)
		int year = now.getYear();
		String month = now.getMonth().toString();
		int monthValue = now.getMonthValue();
		int dayOfMonth = now.getDayOfMonth();
		int dayOfYear = now.getDayOfYear();
		String dayOfWeek = now.getDayOfWeek().toString();
		int dayOfWeekValue = now.getDayOfWeek().getValue();
		// 결과 출력
		System.out.println(now); // 2021-06-17
		System.out.println(year); // 2021
		System.out.println(month + "(" + monthValue + ")"); // JUNE(6)
		System.out.println(dayOfMonth); // 17
		System.out.println(dayOfYear); // 168
		System.out.println(dayOfWeek + "(" + dayOfWeekValue + ")"); // THURSDAY(4)
		System.out.println(now.getDayOfWeek()+"--------------");
		
		if(args.length !=2) {
			System.out.println("2014. 5. 31 :" + getDayOfWeek(2014, 5, 31));
			System.out.println("2015. 6. 1 :" + getDayOfWeek(2015, 6, 1));
			System.out.println("2014. 5. 1 - 2014. 4. 28 :" + dayDiff(2014, 5, 1, 2014, 4, 28) );
			System.out.println("2015. 6. 29 : " +convertDateToDay(2015, 6, 29));
			System.out.println("735778 : " +convertDateToDate(735778));
			System.out.println("today : "+ convertDateToDate(convertDateToDay(now.getYear(), now.getMonthValue(),
					now.getDayOfWeek().getValue())));
			System.out.println();
			
		}
	}
	
	public static int [] endOfMonth = {
			31,28,31,30,31,30,31,31,30,31,30,31
	};
	public static boolean isLeapYear(int year) {
		return ((year%4==0)&&(year%100!=0)||(year%400==0));
	}
	public static int dayDiff(int y1, int m1, int d1,int y2, int m2, int d2) {
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
	}
	public static int getDayOfWeek(int year, int month, int day) {
		return convertDateToDay(year, month, day)%7 +1;
	};
	public static String convertDateToDate(int day) {
		int year =1;
		int month =0;
		
		while(true) {
			int aYear = isLeapYear(year)? 366:365;
			if(day > aYear) {
				day-= aYear;
				year++;
			}else {
				break;
			}
		}
		while(true) {
			int endDay = endOfMonth[month];
			if(isLeapYear(year)&& month ==1) endDay++;
			
			if(day > endDay) {
				day -= endDay;
				month++;
			}else {
				break;
			}
			
		}
		return year+"-"+(month +1)+"-"+day;
	};
	public static int convertDateToDay(int year, int month, int day) {
		int numOfLeapYear =0;
		
		for(int i=1; i<year; i++) {
			if(isLeapYear(i))
				numOfLeapYear++;
		}
		
		int toLastYearDaySum = (year -1) * 365 + numOfLeapYear;
		int thisYearDaySum =0;
		
		for(int i=0; i < month-1 ; i++)
			thisYearDaySum+=endOfMonth[i];
		
		if(month > 2 && isLeapYear(year))
			thisYearDaySum++;
		
		thisYearDaySum+=day;
		
		return toLastYearDaySum + thisYearDaySum;
	};
}
