package shuffleArray;

//��֪��Ϊʲô�Ǵ�ġ�Ӧ���Ǹ�������ˣ�����

//Ӧ����ÿһ��������Ҫ������Ӧ���������Ȼ��ֱ��á�����ͳһѭ������
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