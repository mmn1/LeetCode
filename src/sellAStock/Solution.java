package sellAStock;

public class Solution {
    public int maxProfit(int[] prices) {
    	int res = 0, temp = 0;
    	for(int i=0; i<prices.length-1; i++) {
			temp = temp + prices[i+1] - prices[i];
    		if(temp > res)	res = temp;
    		if(temp < 0)	temp = 0;
    		
    	}
    	return res;
    }
}
