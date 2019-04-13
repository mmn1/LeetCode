package letterCombinationsOfPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber2 {
    public List<String> letterCombinations(String digits) {
    	List<String> list = new LinkedList<>();
    	String base = "";
    	if(digits == null || digits.length() == 0)	return list;
    	helper(0, digits, base, list);
    	return list;
    }
    //���õݹ���̣�ջ���������Զ���¼�����������Ӷ��ﵽֻ��һ�����������зֻ����ඨ���Ŀ��
    public void helper(int cur, String digits, String base, List<String> list){
    	if(cur >= digits.length()) {
    		list.add(base);
    		return;
    	}
    	char[] tmp = getChar(digits.charAt(cur++));
    	for(int i=0; i<tmp.length; i++) {
//    		base = base + tmp[i];	
    		//�������󣬲�Ӧ���ٴδ��仯��������Ӱ����һ��ѭ����Ӧ��Ҫ�ڵݹ麯����ȥ�Ķ�
    		helper(cur, digits, base+tmp[i], list);
    	}
    }
    public char[] getChar(char digit) {
    	switch(digit) {
	        case '0': return new char[]{' '};
	        case '2': return new char[]{'a', 'b', 'c'};
	        case '3': return new char[]{'d', 'e', 'f'};
	        case '4': return new char[]{'g', 'h', 'i'};
	        case '5': return new char[]{'j', 'k', 'l'};
	        case '6': return new char[]{'m', 'n', 'o'};
	        case '7': return new char[]{'p', 'q', 'r', 's'};
	        case '8': return new char[]{'t', 'u', 'v'};
	        case '9': return new char[]{'w', 'x', 'y', 'z'};
	        default: return new char[0];
    	}
    }
}
