class Code {
	public static void main(String... args) {
		getTimeAndDate();
	}
	public static void getTimeAndDate() {
		final long TIME_ZONE_OFFSET = 6; //Bd Time Zone Offset to GMT
		long totalTime = System.currentTimeMillis();
		totalTime /= 1000;
		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = (totalTime % 60 < 10 ? ":0" + totalTime % 60 : ":" + totalTime % 60) + currentMinuteAndSecond;
			totalTime /= 60;
		}
		long currentHour = (int)(totalTime % 24);
		String setAmOrPm = "";
		if (currentHour == 0) {
			currentHour = 24;
		} else if (currentHour > 12) {
			currentHour += TIME_ZONE_OFFSET;
			setAmOrPm = " AM";
		} else {
			currentHour -= TIME_ZONE_OFFSET;
			setAmOrPm = " PM";
		}
		System.out.println("Current TIME : \t" + currentHour + "" + currentMinuteAndSecond + "" + setAmOrPm);
		long totalDays = totalTime / 24;
		int currentYear = (int)(totalDays / 365) + 1970;
		
		long daysInCurrentYear = (totalDays - numberOfLeapYearSince1970(currentYear)) % 365;
		if (currentHour > 0) daysInCurrentYear++;

		int currentMonthNum = getMonthFrom(currentYear, (int) daysInCurrentYear);
		System.out.println(currentMonthNum);

		int daysTillCurrentMonth = getDaysToReachThatMonth(currentYear, currentMonthNum);

		String month = getMonthName(currentMonthNum);

		int today = (int)daysInCurrentYear - daysTillCurrentMonth;

		int startDay = getStartDay(currentYear, currentMonthNum);

		String dayOfWeek = dayNameOfWeek((today + startDay) % 7);

		System.out.println("Current DATE : " + dayOfWeek + "," + month + "-" + today + "-" + currentYear);
	}
	public static String dayNameOfWeek(int dayOfWeek) {
		String[] dayNameOfWeek = { " Saturday", " Sunday", " Monday", " Tuesday", " WednesDay", " Thursday", " Friday"};
		return dayNameOfWeek[dayOfWeek];
	}
	public static int getMonthFrom(int year, int days) {
		int dayTracker = 0;
		for (int i = 1; i <= 12; i++) {
			dayTracker += getNumberOfDaysInMonth(year, i);
			if (dayTracker > days) return i;
		}
		return 12;
	}
	public static int getDaysToReachThatMonth(int year, int month) {
		int dayTracker = 0;
		for (int i = 1; i < month; i++) 
			dayTracker += getNumberOfDaysInMonth(year, i);
		return dayTracker;
	}
	public static int numberOfLeapYearSince1970(long year) {
		int count = 0;
		for (int i = 1970; i<= year; i++)
			if (isLeapYear(i)) count++;
		return count;
	}
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				total = total + 366;
			} else 
				total = total + 365;
		}
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);
		return total;
	}
	public static int getNumberOfDaysInMonth(int year, int month) {
		int lastDayOfMonth = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastDayOfMonth = 31;
		} else if (month == 2) {
			lastDayOfMonth = isLeapYear(year) ? 29 : 28;
		} else {
			lastDayOfMonth = 30;
		}
		return lastDayOfMonth;
	}
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	public static String getMonthName(int month) {
		String[] monthName = {" January", " February", " March", " April", " May", " June", " July", " Augest", " September", " October", " November", " December"};
		return monthName[month - 1];
	}
}
