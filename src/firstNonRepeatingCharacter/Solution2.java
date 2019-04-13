package firstNonRepeatingCharacter;

public class Solution2 {
    public int firstUniqChar(String s) {
    	int index = -1, result = s.length();
    	for(char ch='a'; ch<='z'; ch++) {
    		index = s.indexOf(ch);
    		if(index != -1 && index == s.lastIndexOf(ch))
    			result = result < index ?result:index;
    	}
        if(result == s.length())
            return -1;
    	return result;
    }
}
