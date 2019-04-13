package hammingDistance;
//应该多考虑一下二进制本身的特性
//先进行二进制的异或运算，保留下来的1就是不一样的，可以直接数出1的个数
public class Solution2 {
    public int hammingDistance(int x, int y) {
    	int mix = x ^ y;	//对两个整数进行按位异或,对应位数值不一样则为1
    	int flag = 1, res = 0;
    	while(flag != 0) {
    		if((flag & mix) != 0) {
    			res++;
    		}
    		flag = flag << 1;
    	}
    	return res;
    }
}
