package numberOf1;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
//		long i = 4294967295;
		double res = sol.hammingWeight(11);
		System.out.println(res);
		int flag = 1, ii;
		String iii;
		for(int i=1; i<39; i++) {
			if(i == 30)
				ii =0;
			flag = flag << 1;
    		iii = Integer.toBinaryString(flag);
		}
	}
}
