package in.gmsk.string;

import org.junit.jupiter.api.Test;

class StockMinMaxTest {

	/*private int[] oneWeekPrices = {100,500,50,400,300,250,449};

	@Test
	void testFindMinAndMaxStock() {
		StockMinMax stockPrice = new StockMinMax();
		int output = stockPrice.findMinAndMaxStock(oneWeekPrices);
		
		System.out.println("Max Price : "+output);
	}*/
	
	@Test
	void testFindMinAndMaxStock() {
		StockMinMax stockPrice = new StockMinMax();
		stockPrice.addStack();
	}

}
