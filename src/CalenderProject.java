
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalenderProject {
	// This program takes two user inputed dates and finds the difference, in time,
	// between them.
	int timeYears = 0;
	int timeMonths = 0;
	int timeDays = 0;

	public static void main(String[] args) {
		Scanner usersDate = new Scanner(System.in);
		LocalDate date1 = null;
		LocalDate date2 = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		CalenderProject calculator = new CalenderProject();
		String differenceOfDates = "";
		// Prompt for user to input date in a given format
		System.out.println("Please enter a date using the format MM/DD/YYYY: ");
		date1 = LocalDate.parse(usersDate.next(), formatter);

		System.out.println("Please enter another date using the same format: ");
		date2 = LocalDate.parse(usersDate.next(), formatter);

		differenceOfDates = calculator.calculateDifference(date1, date2);
		System.out.println(differenceOfDates);
	}

	// Takes the difference between the two dates and prints it out in a years,
	// months, days format.
	String calculateDifference(LocalDate date1, LocalDate date2) {
		Period timeElapsed = Period.between(date1, date2);

		timeYears = Math.abs(timeElapsed.getYears());
		timeMonths = Math.abs(timeElapsed.getMonths());
		timeDays = Math.abs(timeElapsed.getDays());

		return String.format("The difference between the two dates is: %d Years, %d Months, and %d Days.", timeYears,
				timeMonths, timeDays);

	}
}