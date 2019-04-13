package designStack;

import java.util.Stack;

public class MinStack2 {
	private Stack<Integer> stack;
	private int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack2() {
    	stack = new Stack<>();
    }
    //push一次直接压一或者两个数进去，min在下面。每一个数下面的min代表的是到当前数值，栈中的最小值。
    public void push(int x) {
    	if(x < min) {
    		stack.push(min);
    		min = x;
    	}
        stack.push(x);
    }
    //弹出的时候，查看是否弹出的是最小值，如果是则改变min。
    //如果最小值发生了变化，则一次弹出两个，若最小值没有发生变化，只需弹出一个即可
    public void pop() {
    	if(stack.pop() == min) {
            min = stack.pop();
            return;
    	}
    	stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
    	return min;
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