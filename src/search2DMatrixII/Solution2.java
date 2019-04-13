package search2DMatrixII;
//首先选出一个单调性来，再根据单调性进行遍历
//二维单调性比折半查找，性能优越很多
public class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length == 0 || matrix == null) {
    		return false;
    	}
    	int col = 0, row = matrix.length-1;
    	while(col < matrix[0].length && row >= 0) {
    		if(matrix[row][col] == target) {
    			return true;
    		}else if(matrix[row][col] > target) {
    			row--;
    		}else {
    			col++;
    		}
    	}
    	return false;
    }
}
