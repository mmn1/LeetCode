package designStack;

import java.util.LinkedList;
import java.util.Stack;

class MinStack {
	private LinkedList<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
    	stack = new LinkedList<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {	//使用ListedLink要比Stack查找效率要高一点
    	int res = Integer.MAX_VALUE;
        for(Integer x : stack) {
        	if(x < res) {
        		res = x;
        	}
        }
        return res;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */