package in.gmsk.array;

import java.util.Arrays;

public class Java8ArrayProblems {

	public int fetchSecondSmallNumber(int[] args) {
		return Arrays.stream(args).distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("There is not have number."));
	}
}
