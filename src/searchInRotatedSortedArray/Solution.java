package searchInRotatedSortedArray;
//感觉对于已排序或者是未排序的数组，最好的办法就是折半查找了。。。

//这个程序的关键在于确定中间点在哪一边是有序排序
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1, mid;
        while(low <= high) {
        	mid = low + (high - low) / 2;
        	if(nums[mid] == target)	return mid;
        	if(nums[mid] >= nums[low]) {
        		if(nums[mid] >= target && target >= nums[low]) {
        			high = mid - 1;
        		}else {
        			low = mid + 1;
        		}
        	}else {
        		if(nums[mid] <= target && nums[high] >= target) {
        			low = mid + 1;
        		}else {
        			high = mid - 1;
        		}
        	}
        }
        return -1;
    }
}