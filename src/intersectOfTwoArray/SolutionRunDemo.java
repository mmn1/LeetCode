package intersectOfTwoArray;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,6,1,7};
		Solution2 sol = new Solution2();
		int[] arr3 = sol.intersect(arr1, arr2);
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}
}
