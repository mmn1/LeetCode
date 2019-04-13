package generateParentheses;

import java.util.LinkedList;
import java.util.List;
//和将数字和字母对应起来那一题类似思路递归
public class Solution {
	private int num;
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        if(n == 0) 	return res;
        num = n;
        helper(0, 0, 0, "", res);
        return res;
    }
    public void helper (int cur,int halfNum, int allNum, String base, List<String> res) {
    	if(allNum >= 2*num) {
    		res.add(base);
    		return;
    	}
    	if(cur > 0) {
    		helper(cur-1, halfNum, allNum+1, base+")", res);
    		if(halfNum < num) {
    			helper(cur+1, halfNum+1, allNum+1, base+"(", res);
    		}
    	}else {
			helper(cur+1, halfNum+1, allNum+1, base+"(", res);
    	}
    }
}
