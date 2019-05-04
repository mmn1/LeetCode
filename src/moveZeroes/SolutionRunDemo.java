package moveZeroes;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] nums = {0};
		sol.moveZeroes(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
