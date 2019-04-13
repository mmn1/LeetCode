package powerOfThree;

public class Solution2 {
    public boolean isPowerOfThree(int n) {
    	return Integer.toString(n, 3).matches("10*$");
    	//将对应整数转化为对应进制的数，用字符串表示。
    	//再与正则表达式进行比较
    }
}
