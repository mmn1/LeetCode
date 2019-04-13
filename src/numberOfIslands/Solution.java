package numberOfIslands;

public class Solution {
	private char[][] grid;
    public int numIslands(char[][] grid2) {
    	grid = grid2;
    	int res = 0;
    	for(int i=0; i<grid.length; i++) {
    		for(int j=0; j<grid[0].length; j++) {
    			res = helper(i, j) + res;
    		}
    	}
    	return res;
    }
    public int helper(int row, int col) {
    	if(row<0 || row==grid.length || col<0 || col==grid[row].length || 
    			grid[row][col]=='0') {
    		return 0;
    	}
    	grid[row][col] = '0';
    	helper(row-1, col);
    	helper(row, col-1);
    	helper(row+1, col);
    	helper(row, col+1);
    	return 1;
    }
}

//
//public class Solution {
//    char[][] g;
//    public int numIslands(char[][] grid) {
//        int islands = 0;
//        g = grid;
//        for (int i=0; i<g.length; i++)
//            for (int j=0; j<g[i].length; j++)
//                islands += sink(i, j);
//        return islands;
//    }
//    int sink(int i, int j) {
//        if (i < 0 || i == g.length || j < 0 || j == g[i].length || g[i][j] == '0')
//            return 0;
//        g[i][j] = '0';
//        sink(i+1, j); sink(i-1, j); sink(i, j+1); sink(i, j-1);
//        return 1;
//    }
//}