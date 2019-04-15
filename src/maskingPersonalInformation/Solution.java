package maskingPersonalInformation;

public class Solution {
    public String maskPII(String S) {
        if(Character.isLetter(S.charAt(0))) {
        	return maskEmail(S);
        }else {
        	return maskPhone(S);
        }
    }
    public String maskEmail(String S) {
    	StringBuilder sb = new StringBuilder();
    	char[] s = S.toCharArray();
    	sb.append(Character.toLowerCase(s[0]));
    	sb.append("*****");
    	int i = 1;
    	while(s[++i] != '@') {
    	}
    	sb.append(Character.toLowerCase(s[--i]));
    	i++;
    	while(i < S.length()) {
    		sb.append(Character.toLowerCase(s[i++]));
    	}
    	return sb.toString();
    }
    public String maskPhone(String S) {
    	StringBuilder sb = new StringBuilder();
    	int len = 0, tmp = 0;
    	char[] s = S.toCharArray();
    	char[] ss = new char[S.length()];
    	
    	while(tmp < S.length()){
    		if(Character.isDigit(s[tmp])) {
    			ss[len++] = s[tmp];
    		}
    		tmp++;
    	}
    	switch(len) {
    	case 13:
    		sb.append("+***-***-***-");
    		break;
    	case 12:
    		sb.append("+**-***-***-");
    		break;
    	case 11:
    		sb.append("+*-***-***-");
    		break;
    	default:
    		sb.append("***-***-");
    		break;
    	}
    	for(int i=4; i>0; i--) {
    		sb.append(ss[len-i]);
    	}
    	return sb.toString();
    }
}
