package robStreetHouses;
//迭代
public class Solution2 {
    public int rob(int[] nums) {
    	int norob = 0;	//不抢劫当前房屋,所能得到的最多钱
    	int rob = 0;	//抢劫当前房屋，所能得到的最多钱
    	for(int i=0; i<nums.length; i++) {
    		int cur = norob + nums[i];	//要抢劫当前房屋，前一个房屋必然没有抢劫
    		norob = Math.max(rob, norob);	//不抢劫当前房屋，那么前一个房屋，可抢可不抢。取最大值
    		rob = cur;	//抢劫完，重新赋值
    	}
    	return Math.max(norob, rob);
    }
}
