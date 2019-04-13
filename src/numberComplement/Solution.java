package numberComplement;

public class Solution {
    public int findComplement(int num) {
    	boolean tmp = false;
        for(int i=31; i>=0; i--) {
        	if((num & (1<<i)) > 0) {
        		tmp = true;
        	}
        	if(tmp) {
        		num ^= (1<<i);
        	}
        }
        return num;
    }
}
