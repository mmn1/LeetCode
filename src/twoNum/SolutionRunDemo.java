package twoNum;

public class SolutionRunDemo {
    public static void main(String [] args) {
    	int [] nums = {2, 3, 4};
    	int target = 6;
    	
    	long start=System.currentTimeMillis(); //��ȡ��ʼʱ��
    	 
        //Ҫ���Եĳ���򷽷�

                             
    	Solution sol = new Solution();
    	int [] num = sol.twoSum(nums, target);
    	System.out.println(num[0] + "  " + num[1]);

        long end=System.currentTimeMillis(); //��ȡ����ʱ��
        System.out.println("��������ʱ�䣺 "+(end-start)+"ms"); 
        
    	Solution2 sol2 = new Solution2();
    	int [] num2 = sol2.twoSum(nums, target);
    	System.out.println(num2[0] + "  " + num2[1]);
    	
    	Solution3 sol3 = new Solution3();
    	int[] num3 = sol3.twoSum(nums, target);
    	System.out.println(num2[0] + "  " + num2[1]);
    	
    }
}
