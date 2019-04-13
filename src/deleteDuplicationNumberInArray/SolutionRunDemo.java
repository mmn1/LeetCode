package deleteDuplicationNumberInArray;

public class SolutionRunDemo {
	public static void main(String[] args) {
		int [] arr = {0,1,1,2,3,3,5,5,6};
		Solution2 sol = new Solution2();
		int len = sol.removeDuplicates(arr);
		System.out.println(len);
		for(int i=0; i<len; i++)
			System.out.println(arr[i]);
	}
}
