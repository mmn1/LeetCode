package jumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
    	if(nums.length == 0 || nums == null)	return false;
    	if(nums.length == 1) return true;
        int len = nums.length;
        int res = len - 1;	
        //��Ŀ�ĵ������ƣ����ȷ�����Ե���Ŀ�ĵأ�������Ϊ�µ�Ŀ�ĵء�
        //һֱ������и��£�������ս����0��֤���ӵ�һ�����Ե������һ��
        for(int i=len-2; i>=0; i--) {
        	if(nums[i] >= res - i) {
        		res = i;	//������Ե���ԭĿ�ĵأ����������Ϊ�µ�Ŀ�ĵ�
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