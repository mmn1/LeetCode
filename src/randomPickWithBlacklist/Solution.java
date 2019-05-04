package randomPickWithBlacklist;

import java.util.Arrays;
import java.util.Random;

public class Solution {
	private int[] blacklist;
	private int num;
	
    public Solution(int N, int[] blacklist) {
    	this.num = N;
    	this.blacklist = blacklist;
    	Arrays.sort(this.blacklist);
    }
    
    public int pick() {
    	int blackLen = blacklist.length;
    	Random ran = new Random();
        int tmp = ran.nextInt(num - blackLen);
        tmp = 1;
        int choice = -1;
        for(int i=0; i<blackLen; i++) {
        	if(blacklist[i] == tmp) {
        		choice = i;
        		break;
        	}
        }
        if(choice == -1)	return tmp;
        int k = num- 1;
        for(int i=0; i<num; i++) {
        	if(contain(k)) {
        		k--;
        	}else if(choice != 0){
        		choice--;
        		k--;
        	}else {
        		break;
        	}
        }
        return k;
    }
    
    public boolean contain(int n) {
        int low = 0;
        int high = blacklist.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            //如果要查找的元素findElem小于中间位置的元素mid，指向数组的较大端的high索引重新指向中间索引mid的左边（mid-1）
            if (n < blacklist[mid]) {
                high = mid - 1;
            }
            //如果要查找的元素findElem大于中间位置的元素mid，指向数组的较小端的low索引重新指向中间索引mid的右边（mid+1）
            if (n > blacklist[mid]) {
                low = mid + 1;
            }
            if (blacklist[mid] == n) {
                return true;
            }
        }
        return false;
    }
    
//    	int left = 0, right = blacklist.length - 1;
//    	while(left <= right) {
//    		int mid = left + (right - left) / 2;
//    		if(blacklist[mid] == n) {
//    			return true;
//    		}
//    		if(blacklist[mid] < n) {
//    			left = mid + 1;
//    		}else {
//    			right = mid - 1;
//    		}
//    	}
//    	return blacklist[left] == n;
//    }
}
