package shuffleArray;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		 Solution2 obj = new Solution2(nums);
		 int[] param_2 = obj.shuffle();
		 System.out.println(Arrays.toString(param_2));
		 int[] param_1 = obj.reset();
		 System.out.println(Arrays.toString(param_1));
		 param_2 = obj.shuffle();
		 System.out.println(Arrays.toString(param_2));
	}
}
