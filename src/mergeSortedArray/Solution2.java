package mergeSortedArray;

//����˫ָ����ַ�������ǰ��ͬ���������ǴӺ���ǰ���������
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = m - 1, j = n - 1, k = m + n - 1;
    	while(i > -1 && j > -1) {
    		nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
    	}
    	while(j > -1) {	
    		//��Ϊ������nums1��������ģ��������nums2���Ž�ȥ���Ǿ��Ѿ���������ˡ����û���Ž�ȥ�������������Ž�ȥ
    		nums1[k--] = nums2[j--]; 
    	}
    }
}
