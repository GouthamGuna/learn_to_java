package stream;

import org.junit.jupiter.api.Test;

class Java8ArrayProblemsTest {

	private int[] args = {5,2,8,3,1,1};

	@Test
	void testFetchSecondLargeNumber() {
		
		Java8ArrayProblems instance = new Java8ArrayProblems();
		int output = instance.fetchSecondSmallNumber(args);
		
		System.out.println("output : "+output);
	}

}
