package numberOfIslands;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		char[][] grid = {{'1','1','1'},
				{'0','1','0'},
				{'1','1','1'}};
		int res = sol.numIslands(grid);
		System.out.print(res);
	}
}
