package in.gmsk.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
}
