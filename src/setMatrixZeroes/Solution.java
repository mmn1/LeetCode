package setMatrixZeroes;

import java.util.Arrays;

public class Solution {
    public void setZeroes(int[][] matrix) {
    	int[] row = new int[matrix.length];
    	int[] col = new int[matrix[0].length];
    	for(int i=0; i<matrix.length; i++) {
    		for(int j=0; j<matrix[0].length; j++) {
    			if(matrix[i][j] == 0) {
    				row[i]++;
    				col[j]++;
    			}
    		}
    	}
    	for(int i=0; i<row.length; i++) {
    		if(row[i] != 0) {
    			Arrays.fill(matrix[i], 0);
    		}
    	}
    	for(int j=0; j<col.length; j++) {
    		if(col[j] != 0) {
    			for(int i=0; i<row.length; i++) {
    				matrix[i][j] = 0;
    			}
    		}
    	}
    }
}
