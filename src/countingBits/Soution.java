package countingBits;

import java.util.ArrayList;

public class Soution {
    public int[] countBits(int num) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<=num; i++) {
        	al.add(Integer.bitCount(i));
        }
        int size = al.size();
        int[] res = new int[size];
        for(int i=0; i<size; i++) {
        	res[i] = al.get(i);
        }
        return res;
    }
}
