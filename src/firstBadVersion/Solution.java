//package firstBadVersion;
//
//public class Solution {
//	public int firstBadVersion(int n) {
//		int start = 1, end = n;
//		// mid = (start + end) / 2��ô������ܻᷢ���������Ϊ���ʵĶ�����
//		// mid = start + (end - start) / 2
//
//		while (start < end) {
//			if (isBadVersion(start + (end - start) / 2)) { // true
//				if ((start + (end - start) / 2 - 1) == 0 || !isBadVersion(start + (end - start) / 2 - 1)) {
//					return start + (end - start) / 2;
//				}
//				end = start + (end - start) / 2 - 1;
//			} else {// false
//				start = start + (end - start) / 2 + 1;
//			}
//		}
//		return start;
//	}
//}
