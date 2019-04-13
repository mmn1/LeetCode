package rotateArray;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		sol.rotate(arr, k);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]);
	}
}
