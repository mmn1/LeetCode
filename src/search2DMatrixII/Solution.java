package search2DMatrixII;

class Solution {
//	private int  high;
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length == 0 || matrix ==null) {
    		return false;
    	}
    	int high = matrix[0].length-1;
        for(int i=0; i<matrix.length; i++) {
        	//折半查找, 根据上一行的情况，排除下一行的大数
        	int low = 0, mid;
        	while(low <= high) {
        		mid = (low + high) / 2;
        		if(matrix[i][mid] == target) {
        			return true;
        		}
        		if(matrix[i][mid] < target) {
        			low = mid + 1;
        		}else {
        			high = mid - 1;
        		}
        	}
        }
        return false;
    }
//    public boolean helper(int[][] matrix, int target, int row) {
//    	//折半查找, 根据上一行的情况，排除下一行的大数
//    	int low = 0, mid;
//    	while(low <= high) {
//    		mid = (low + high) / 2;
//    		if(matrix[row][mid] == target) {
//    			return true;
//    		}
//    		if(matrix[row][mid] < target) {
//    			low = mid + 1;
//    		}else {
//    			high = mid - 1;
//    		}
//    	}
//    	return false;
//    }
}