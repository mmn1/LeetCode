package binaryWatch;

import java.util.ArrayList;
import java.util.List;
//有两个思路
//一、由1的数量推对应的时间，
//二、由时间来确定是否符合1的数量要求
//采用第二种方法可以不用考虑数的构造问题，直接遍历12*60即可。这样会比较简单。
//甚至可以采用直接case 0-10的方法
public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<12; i++) {
        	for(int j=0; j<60; j++) {
        		if(Integer.bitCount(i)+Integer.bitCount(j) == num) {
        			res.add(String.format("%d:%02d", i, j));
        		}
        	}
        }
        return res;
    }
}
