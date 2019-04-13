package medianOfTwoSortedArrays;

public class Solution1 {
	public double findMedianSortedArrays(int[] A, int[] B) {
		int m = A.length, n = B.length;		//��Ҫ��n>m
		if(m>n) {
			int[] C = A;	A = B;	B = C;
			int temp = m;	m = n;	n = temp;
		}
		int iMin = 0, iMax = m, halfLen = (m+n+1)/2;
		while(iMin<=iMax) {
			int i = (iMin+iMax)/2;
			int j = halfLen - i;
			if(i>iMin && A[i-1]>B[j]) {
				iMax = i-1;
			}else if(i<iMax && A[i]<B[j-1]) {
				iMin = i+1;
			}else {
				int maxLeft = 0;
				if(i==0)
					maxLeft = B[j-1];
				else if(j==0)
					maxLeft = A[i-1];
				else
					maxLeft = Math.max(A[i-1], B[j-1]);
				if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
			}
		}
		return 0.0;
	}
}
