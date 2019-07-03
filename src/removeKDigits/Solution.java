package removeKDigits;

import java.util.LinkedList;

public class Solution {
	public String removeKdigits(String num, int k) {
		LinkedList<Character> stack = new LinkedList<>();
		for (int i = 0; i < num.length(); i++) {
			while (!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(i));
		}
		
		while (k > 0) {
			if (!stack.isEmpty()) {
				stack.pop();
				k--;
			} else {
				break;
			}
		}
		while (!stack.isEmpty() && stack.peekLast() == '0') {
			stack.removeLast();
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.removeLast());
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}
}