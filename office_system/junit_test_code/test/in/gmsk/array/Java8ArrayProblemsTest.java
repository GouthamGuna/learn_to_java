package in.gmsk.array;

import java.util.List;

import org.junit.jupiter.api.Test;

class Java8ArrayProblemsTest {

	@Test
	void testFetchSecondSmallNumber() {
		List<Integer> output = null;
		
		//int[] arr = {5,2,8,3,1};
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,8,9,7,1};
		
		Java8ArrayProblems instance = new Java8ArrayProblems();
		//int output = instance.fetchSecondSmallNumber(arr);
		
		//System.out.println("output : "+output);
		
		output = instance.fetchingSameElementInArrays(arr1, arr2);
		
		System.out.println("output : "+output);
	}

}
