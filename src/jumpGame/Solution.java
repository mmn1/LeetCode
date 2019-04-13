package jumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
    	if(nums.length == 0 || nums == null)	return false;
    	if(nums.length == 1) return true;
        int len = nums.length;
        int res = len - 1;	
        //从目的地往回推，如果确定可以到达目的地，则将其设为新的目的地。
        //一直对其进行更新，如果最终结果是0则证明从第一个可以到达最后一个
        for(int i=len-2; i>=0; i--) {
        	if(nums[i] >= res - i) {
        		res = i;	//如果可以到达原目的地，则将这个点设为新的目的地
        	}
        }
        if(res == 0) {
        	return true;
        }else {
        	return false;
        }
    }
}
//0, 1, 2