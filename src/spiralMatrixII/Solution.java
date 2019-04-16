package spiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int direction = 0;	//0£ºÓÒ£¬1£ºÏÂ£¬2£º×ó£¬3£ºÉÏ
        int row = 0, col = 0;
        for(int i=1; i<=n*n; ) {
        	switch (direction) {
        	case 0:
        		while(col < n && res[row][col] == 0) {
        			res[row][col] = i;
        			i++;
        			col++;
        		}
        		col--;
        		row++;
        		direction = 1;
        		break;
        	case 1:
        		while(row < n && res[row][col] == 0) {
        			res[row][col] = i;
        			i++;
        			row++;
        		}
        		row--;
        		col--;
        		direction = 2;
        		break;
        	case 2:
        		while(col >= 0 && res[row][col] == 0) {
        			res[row][col] = i;
        			i++;
        			col--;
        		}
        		col++;
        		row--;
        		direction = 3;
        		break;
        	case 3:
        		while(row >= 0 && res[row][col] == 0) {
        			res[row][col] = i;
        			i++;
        			row--;
        		}
        		row++;
        		col++;
        		direction = 0;
        		break;
        	}
        }
        return res;
    }
}
