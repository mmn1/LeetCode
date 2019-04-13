package twoNum;

public class SolutionRunDemo {
    public static void main(String [] args) {
    	int [] nums = {2, 3, 4};
    	int target = 6;
    	
    	long start=System.currentTimeMillis(); //获取开始时间
    	 
        //要测试的程序或方法

                             
    	Solution sol = new Solution();
    	int [] num = sol.twoSum(nums, target);
    	System.out.println(num[0] + "  " + num[1]);

        long end=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(end-start)+"ms"); 
        
    	Solution2 sol2 = new Solution2();
    	int [] num2 = sol2.twoSum(nums, target);
    	System.out.println(num2[0] + "  " + num2[1]);
    	
    	Solution3 sol3 = new Solution3();
    	int[] num3 = sol3.twoSum(nums, target);
    	System.out.println(num2[0] + "  " + num2[1]);
    	
    }
}
