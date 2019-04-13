package evaluateReversePolishNotation;

import java.util.LinkedList;

public class Solution {
    public int evalRPN(String[] tokens) {
    	LinkedList<Integer> ls = new LinkedList<>();
        for(int i=0; i<tokens.length; i++) {
        	switch (tokens[i]) {
        		case "+":  
        			int tmp = ls.pollLast() + ls.pollLast();
        			ls.add(tmp);
        			break;
        		case "-":  
        			int tmp2 = -(ls.pollLast() - ls.pollLast());
        			ls.add(tmp2);
        			break;
        		case "*":  
        			int tmp3 = ls.pollLast() * ls.pollLast();
        			ls.add(tmp3);
        			break;
        		case "/":  
        			int numb = ls.pollLast();
        			int numa = ls.pollLast();
        			int tmp4 = numa / numb ;
        			ls.add(tmp4);
        			break;
        		default:
        			int tmp5 = Integer.valueOf(tokens[i]);
        			ls.add(tmp5);
        			break;
        	}
        }
        return ls.pollLast();
    }
}
