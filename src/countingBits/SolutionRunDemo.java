package countingBits;

import java.util.ArrayList;
import java.util.List;

public class SolutionRunDemo {
	public static void main(String[] args) {
        List<String> list=new ArrayList<String>();  
        list.add("������");  
        list.add("����");  
        list.add("����");  
        int size=list.size();  
        String[] array = (String[])list.toArray(new String[size]);  
        for(int i=0;i<array.length;i++){  
            System.out.println(array[i]);  
        }  
		System.out.println(Integer.bitCount(16));
	}

}
