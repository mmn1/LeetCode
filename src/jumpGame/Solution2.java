package jumpGame;
//正向判断，采用类似窗口的方法，每一步取最大窗口，只要窗口将目的地覆盖则证明可行

public class Solution2 {
    public boolean canJump(int[] nums) {
    	int tep = 0;
    	if(nums.length == 0 || nums == null) {
    		return false;
    	}
    	for(int i=0; i<=tep; i++) {
    		tep = Math.max(tep, i+nums[i]);
    		if(tep >= nums.length - 1) {
    			return true;
    		}
    	}
    	return false;
    }
}
