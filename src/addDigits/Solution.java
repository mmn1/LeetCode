package addDigits;

public class Solution {
    public int addDigits(int num) {
    	//这种东西最好通过找规律实现，可以确定取余都是从1-9重复出现的
    	//以下代码是通过直观实现的n(1)
        int carr = 0, res = 0;
        while(carr == 1 || num > 0) {
        	int num1 = num % 10;
        	num = num / 10;
        	res = carr + num1 + res;
        	carr = res / 10;
        	res = res % 10;
        }
        return res;
    }
}
