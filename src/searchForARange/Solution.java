package searchForARange;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int low = 0, high = nums.length-1, mid, add = 0, cut = 0;
        while(low <= high) {	//�����۰���ң�ȷ���������Ƿ����target���ҳ����±�
        	mid = low + (high - low) / 2;
        	if(nums[mid] == target) {
        		while(mid+add+1 < nums.length && nums[mid+add+1] == target) {
        			//�����ҵ����±��������������
        			add++;
        		}
        		while(mid-cut-1 >= 0 && nums[mid-cut-1] == target) {
        			cut++;
        		}
        		return new int[] {mid-cut, mid+add};
        	}
        	if(nums[mid] < target) {
        		low = mid + 1;
        	}else {
        		high = mid - 1;
        	}
        }
        return new int[] {-1, -1};
    }
}
