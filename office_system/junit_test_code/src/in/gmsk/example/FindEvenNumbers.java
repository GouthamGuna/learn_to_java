package in.gmsk.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class FindEvenNumbers {

	public void findListOfEvenNumbers() {

		int[] listOfumbers = {1, 12, 3, 4, 5, 66, 77, 50, 44};
		
		List<Integer> evenNo = new ArrayList<>();
		List<Integer> oddNo = new ArrayList<>();
		
		for(int i: listOfumbers) {
			
			if(i % 2 == 0) {
				evenNo.add(i);
			}else {
				oddNo.add(i);
			}
		}
		
		Collections.sort(evenNo);
		Collections.sort(oddNo);
		
		out.println("Even No : "+ evenNo.toString());
		out.println("Odd No : "+ oddNo.toString());
	}
}
