package medianOfTwoSortedArrays;

import java.util.Arrays;

public class SolutionRunDemo {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] a = {1, 4};
		int[] b = {3};
		long start=System.currentTimeMillis(); //获取开始时间
		double c = sol.merge(a, b);
		long end = System.currentTimeMillis();
//		for(int i=0; i<c.length; i++)
//			System.out.println(c[i]);
		long x = end-start;
		System.out.println(c+"  "+(end-start)+"ms");
		Solution1 sol1 = new Solution1();
		long start1 = System.currentTimeMillis();
		double cc = sol1.findMedianSortedArrays(a, b);
		long end1 = System.currentTimeMillis();
		long x1 = end1 - start1;
		System.out.println(cc+"   "+x1);
	}
}
