package a1bitAnd2bitCharacters;

public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int pos = 0, len = bits.length;
        while(pos < len - 1) {
        	pos += bits[pos] + 1;
        }
        return pos == len - 1;
    }
}
