package DayA9_0324;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간", "분","초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println(time1.get(Calendar.HOUR_OF_DAY)+"__"+time1.get(Calendar.MINUTE)+
				"__"+time1.get(Calendar.SECOND));
		System.out.println(time2.get(Calendar.HOUR_OF_DAY)+"__"+time2.get(Calendar.MINUTE)+
				"__"+time2.get(Calendar.SECOND));
		
	}
}
