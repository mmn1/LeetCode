package robStreetHouses;
//����
public class Solution2 {
    public int rob(int[] nums) {
    	int norob = 0;	//�����ٵ�ǰ����,���ܵõ������Ǯ
    	int rob = 0;	//���ٵ�ǰ���ݣ����ܵõ������Ǯ
    	for(int i=0; i<nums.length; i++) {
    		int cur = norob + nums[i];	//Ҫ���ٵ�ǰ���ݣ�ǰһ�����ݱ�Ȼû������
    		norob = Math.max(rob, norob);	//�����ٵ�ǰ���ݣ���ôǰһ�����ݣ������ɲ�����ȡ���ֵ
    		rob = cur;	//�����꣬���¸�ֵ
    	}
    	return Math.max(norob, rob);
    }
}
