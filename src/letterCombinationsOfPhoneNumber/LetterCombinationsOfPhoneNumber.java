package letterCombinationsOfPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
    	List<String> res =  new LinkedList<>();
    	if(digits == null || digits.length() == 0)	return res;
        String[] dict = {"0", "1", "abc", "def", "ghi", 
        		"jkl", "mno", "pqrs", "tuv", "wxyz"};	//���һ���ֵ�
        res.add("");	//����list�������һ���հױ������ǵ�list��Ԫ�ظ���Ϊ1������ʵ��""
        for(int i=0; i<digits.length(); i++) {
        	int num = (int)(digits.charAt(i) - '0');
        	String tmp = dict[num];
        	int preSize = res.size();
        	for(int k=0; k<preSize; k++) {	//���Ʋ�������ķ�������ȡsize()�ڽ������
        		String h = res.remove(0);
	        	for(int j=0; j<tmp.length(); j++) {
	        		res.add(h + tmp.charAt(j));
	        	}
        	}
        }
        return res;
    }
}
