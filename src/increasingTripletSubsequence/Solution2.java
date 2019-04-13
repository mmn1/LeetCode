package increasingTripletSubsequence;

public class Solution2 {
    public boolean increasingTriplet(int[] nums) {
    	int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;	
    	//初始化为最大值，之后才可以被赋值
    	for(int num : nums) {
    		if(num <= small) {	//记录最小值
    			small = num;
    		}else if(num <= big) {	
    			//记录在次最小值，这个值可能在最小值前面，因为不需要提取准确数字所以可以
    			big = num;
    		}else {		//只要比前两个大，就代表存在一组数字满足要求
    			return true;
    		}
    	}
    	return false;
    }
}
