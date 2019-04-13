package binaryWatch;

import java.util.ArrayList;
import java.util.List;
//������˼·
//һ����1�������ƶ�Ӧ��ʱ�䣬
//������ʱ����ȷ���Ƿ����1������Ҫ��
//���õڶ��ַ������Բ��ÿ������Ĺ������⣬ֱ�ӱ���12*60���ɡ�������Ƚϼ򵥡�
//�������Բ���ֱ��case 0-10�ķ���
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
