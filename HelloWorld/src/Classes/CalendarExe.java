package Classes;

public class CalendarExe {
	public static void main(String[] args) {
		// 해당월의 날짜수, 월의 첫날(1일)의시작요일.
		int month = 11;
		System.out.println("=========(" + month + "월" + ")=========");
//		System.out.println(getFristDayofMonth(month));
//		System.out.println(getMaxDate(month));
//		for (int i = 1; i <= getMaxDate(month); i++) {
		// System.out.print(i + " ");
//			System.out.printf("%3d", i);
//			if (i % 7 == 0)
//				System.out.println();
		String[] weeks = { "sun ", "mon ", "tue ", "wed ", "thr ", "fri ", "sat " };
		for (int a = 1; a < weeks.length; a++) {
			System.out.print("" + weeks[a]);
		}
		System.out.println();
		System.out.println("=======================");
		int spaceCnt = 0;
		for (int i = 1; i <= getMaxDate(month); i++) {

		}
		
	}

	public static int getFristDayofMonth(int month) {
		int result = 0;
		if (month == 9) {
			result = 1;
		} else if (month == 10) {
			result = 3;
		} else if (month == 11) {
			result = 6;
		} else if (month == 12) {
			result = 1;
		}
		return result;
	}

//해당월의 날짜수
	public static int getMaxDate(int month) {
		int dayCnt = 0;
		if (month <= 7) {
			if (month % 2 == 1) {
				dayCnt = 31;
			} else {
				if (month == 2)
					dayCnt = 28;
				else
					dayCnt = 30;
			}

		} else {
			if (month % 2 == 0) {
				dayCnt = 31;
			} else {
				dayCnt = 30;
			}
		}
		return dayCnt;

	}

}
