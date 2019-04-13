package wordSearch;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		char[][] board = {{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}};
		System.out.println(sol.exist(board, "ABCB"));
	}
}
