package bulbSwitcher;

public class Solution {
    public int bulbSwitch(int n) {
        int[] storage = new int[n];
        int res = 0;
        for(int i=1; i<=n; i++) {
        	for(int j=i-1; j<n; j=j+i) {
        		storage[j] ^= 1;
        	}
        }
        for(int i=0; i<n; i++) {
        	if(storage[i] != 0) {
        		res++;
        	}
        }
        return res;
    }
}
