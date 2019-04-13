package validString;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<>();
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i) == '(') {
    			stack.push(')');
    			continue;
    		}
    		if(s.charAt(i) == '[') {
    			stack.push(']');
    			continue;
    		}
    		if(s.charAt(i) == '{') {
    			stack.push('}');
    			continue;
    		}
    		if(s.charAt(i) == ')' || s.charAt(i) == ']' 
    				|| s.charAt(i) == '}') {
    			if(stack.isEmpty() || s.charAt(i) != stack.pop()) {
    				return false;
    			}
    		}
    	}
    	if(stack.isEmpty()) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
