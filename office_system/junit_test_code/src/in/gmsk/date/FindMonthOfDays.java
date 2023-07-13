package in.gmsk.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class FindMonthOfDays {

	public static void getNumberOfDays() {


		int dayOfMonth = java.time.Month.APRIL.maxLength();

		System.out.println(" dayOfMonth : "+dayOfMonth);
	}

	public int totalSundays(String monthOfDate) {

		int month = Integer.parseInt(monthOfDate.split("-")[1]);
		int year = Integer.parseInt(monthOfDate.split("-")[0]);

		LocalDate startDate = LocalDate.of(year, month, 1); 
		LocalDate endDate = startDate.plus(1, ChronoUnit.MONTHS);

		int count = 0;

		LocalDate date = startDate;
		while (date.isBefore(endDate)) {
			if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
				count++;
			}
			date = date.plus(1, ChronoUnit.DAYS);
		}

		return count;
	}

	public int daysInMonth(String date) {

		Calendar calendar = Calendar.getInstance();

		int year = Integer.parseInt(date.split("-")[0]);
		int month = Integer.parseInt(date.split("-")[1]); 

		calendar.set(year, month - 1, 1); // Month is 0-based

		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		return days;
	}
	
	public static void getStartDateAndEndDate() {
		
		YearMonth yearMonth = YearMonth.of(2023, 7); // e.g. YearMonth.of(2023, 7) for July 2023


		LocalDate firstDay = yearMonth.atDay(1); // e.g. 2023-07-01
		LocalDate lastDay = yearMonth.atEndOfMonth(); // e.g. 2023-07-31
		
		System.out.println("firstDay : "+firstDay);
		System.out.println("lastDay : "+lastDay);
	}

	public static void main(String[] args) {
		getStartDateAndEndDate();
	}

}
