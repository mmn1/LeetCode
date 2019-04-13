package fizzBuzz;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
    	List<String> list = new LinkedList<>();
    	int a = 1, b = 1, c = 1;
    	for(int i=1; i<=n; i++) {
    		if(c == 15) {
    			list.add("FizzBuzz");
    			c = 1; a = 1; b = 1;
    			continue;
    		}
    		if(a == 3) {
    			list.add("Fizz");
    			a = 1; b++; c++;
    			continue;
    		}
    		if(b == 5) {
    			list.add("Buzz");
    			b = 1; a++; c++;
    			continue;
    		}
    		list.add(i+"");
    		c++; a++; b++;
    	}
    	return list;
    }
}
