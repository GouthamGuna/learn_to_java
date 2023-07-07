package in.gmsk.string;

import java.util.ArrayList;
import java.util.List;

public class StockMinMax {
	
	/*public int findMinAndMaxStock(int[] prices) {
		
		System.err.println("lenght of array : "+prices.length);
		
		if(prices.length == 1)return 0;
		
		int minStockPrice = prices[0];
		int maxStockPrice = 0;
		
		for(int i=1; i < prices.length; i++) {
			
			maxStockPrice = Math.max(maxStockPrice, prices[i] - minStockPrice);
			minStockPrice = Math.min(minStockPrice, prices[i]);
		}
		
		return maxStockPrice;
	}*/
	
	public void addStack() {
		
		List<Integer> addNum = new ArrayList<>();
		
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			System.err.println(i);
			addNum.add(i);
		}
	}
}
