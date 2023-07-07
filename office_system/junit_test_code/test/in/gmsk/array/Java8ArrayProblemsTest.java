package in.gmsk.array;

import org.junit.jupiter.api.Test;

class Java8ArrayProblemsTest {

	@Test
	void testFetchSecondSmallNumber() {
		
		int[] args = {5,2,8,3,1};
		
		Java8ArrayProblems instance = new Java8ArrayProblems();
		int output = instance.fetchSecondSmallNumber(args);
		
		System.out.println("output : "+output);
	}

}
