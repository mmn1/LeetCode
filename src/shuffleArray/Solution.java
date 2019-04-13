package shuffleArray;

//不知道为什么是错的。应该是概率算错了！！！

//应该是每一个数都需要求它对应的随机数，然后分别安置。不能统一循环安置
import java.util.Random;

class Solution {
	public int[] nums;
	public int[] temp;
	private Random ran = new Random();
    public Solution(int[] nums) {
        this.nums = nums;
        this.temp = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        this.temp = this.nums.clone();
        return temp;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	if(temp.length == 0)	return temp;
    	int k = ran.nextInt(temp.length), ii = 0;
        for(int i=0; i< temp.length; i++) {
        	//int k = ran.nextInt(temp.length), ii = 0;
        	if(i+k>= temp.length)
        		ii = (i+k)%temp.length;
        	else
        		ii = i + k;
        	temp[ii] = nums[i];
        	
        }
        return temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */