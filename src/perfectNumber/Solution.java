package perfectNumber;

public class Solution {
    public boolean checkPerfectNumber(int num) {
    	if(num < 2)	return false;
        double sqrt = Math.sqrt(num);
        int res = 0;
        for(int i=2; i<sqrt; i++) {
        	if(num % i == 0) {
        		res = res + i + num / i;
        	}
        }
        res++;
        if(num % sqrt == sqrt) {	//相当于自动排除了1
        	res += sqrt;
        }
        return res == num;
    }
}
