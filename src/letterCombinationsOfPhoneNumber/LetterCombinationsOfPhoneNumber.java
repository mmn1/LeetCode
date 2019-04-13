package letterCombinationsOfPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
    	List<String> res =  new LinkedList<>();
    	if(digits == null || digits.length() == 0)	return res;
        String[] dict = {"0", "1", "abc", "def", "ghi", 
        		"jkl", "mno", "pqrs", "tuv", "wxyz"};	//添加一个字典
        res.add("");	//先往list里面添加一个空白变量，是得list的元素个数为1，但其实是""
        for(int i=0; i<digits.length(); i++) {
        	int num = (int)(digits.charAt(i) - '0');
        	String tmp = dict[num];
        	int preSize = res.size();
        	for(int k=0; k<preSize; k++) {	//类似层序遍历的方法，读取size()在进行添加
        		String h = res.remove(0);
	        	for(int j=0; j<tmp.length(); j++) {
	        		res.add(h + tmp.charAt(j));
	        	}
        	}
        }
        return res;
    }
}
