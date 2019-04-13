package designStack;

import java.util.Stack;

public class MinStack2 {
	private Stack<Integer> stack;
	private int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack2() {
    	stack = new Stack<>();
    }
    //pushһ��ֱ��ѹһ������������ȥ��min�����档ÿһ���������min������ǵ���ǰ��ֵ��ջ�е���Сֵ��
    public void push(int x) {
    	if(x < min) {
    		stack.push(min);
    		min = x;
    	}
        stack.push(x);
    }
    //������ʱ�򣬲鿴�Ƿ񵯳�������Сֵ���������ı�min��
    //�����Сֵ�����˱仯����һ�ε�������������Сֵû�з����仯��ֻ�赯��һ������
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