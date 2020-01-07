package Classes.extendpkg;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 0, 1);

		System.out.println("년도:" + cal.get(Calendar.YEAR));
		System.out.println("월:" + cal.get(Calendar.MONTH));
		System.out.println("일:" + cal.get(Calendar.DAY_OF_MONTH));
		// 월은 1월 > 0, 1월 < 1, 12 > 11
		System.out.println("마지막일:" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("오늘의 요일:" + cal.get(Calendar.DAY_OF_WEEK));

		createCal(2020, 2);
	}

	public static void createCal(int year, int month) {
		Calendar cl = Calendar.getInstance();
		int mon = month + 1;
		String[] weeks = { "일 ", "월 ", "화 ", "수 ", "목 ", "금 ", "토 " };
		cl.set(year, month, 1);
		for (int i = 0; i < weeks.length; i++) {
			System.out.print("" + weeks[i]);
			int sp = 0;
			// for (int a =1; a<cl.get(Calendar.DAY_OF_MONTH));
			System.out.println("");
			sp++;

		}

	}
}
