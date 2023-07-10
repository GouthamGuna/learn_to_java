package in.gmsk.array;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Java8ArrayProblems {

	public int fetchSecondSmallNumber(int[] arr) {

		return Arrays.stream(arr).distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("There is not a second number."));
	}

	public List<Integer> fetchingSameElementInArrays(int[] arr1, int[] arr2) {

		List<Integer> output = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2)
				.anyMatch(arr2Number -> arr2Number == number))
				.boxed()
				.collect(Collectors.toList());

		return output;
	}
	
	public void diffBetweenMonthName() {
		
		LocalDate date1 = LocalDate.of(2023, 5, 8);
		LocalDate date2 = LocalDate.of(2023, 4, 1);
		
		Period diff = Period.between(date1, date2);
		System.out.println(diff); //3
		
	}
	
	public void monthNames() {
		
		LocalDate date1 = LocalDate.of(2023, 4, 1);
		LocalDate date2 = LocalDate.of(2023, 5, 8);
		
		String outPut;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM");
		List<String> months = new ArrayList<>();

		while (!date1.isAfter(date2)) {
		    String monthName = date1.format(formatter);
		    months.add(monthName);
		    date1 = date1.plusMonths(1);
		}

		System.out.println("Months between dates: " + months);
		
		
		months.stream()
		.forEach(out::println);
	}
}
