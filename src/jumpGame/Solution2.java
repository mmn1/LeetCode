package jumpGame;
//�����жϣ��������ƴ��ڵķ�����ÿһ��ȡ��󴰿ڣ�ֻҪ���ڽ�Ŀ�ĵظ�����֤������

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
