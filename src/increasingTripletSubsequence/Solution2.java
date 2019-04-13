package increasingTripletSubsequence;

public class Solution2 {
    public boolean increasingTriplet(int[] nums) {
    	int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;	
    	//��ʼ��Ϊ���ֵ��֮��ſ��Ա���ֵ
    	for(int num : nums) {
    		if(num <= small) {	//��¼��Сֵ
    			small = num;
    		}else if(num <= big) {	
    			//��¼�ڴ���Сֵ�����ֵ��������Сֵǰ�棬��Ϊ����Ҫ��ȡ׼ȷ�������Կ���
    			big = num;
    		}else {		//ֻҪ��ǰ�����󣬾ʹ������һ����������Ҫ��
    			return true;
    		}
    	}
    	return false;
    }
}
