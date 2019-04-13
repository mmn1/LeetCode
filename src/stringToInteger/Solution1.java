package stringToInteger;

public class Solution1 {
    public int myAtoi(String str) {
        str = str.trim();
        int sign = 1;
        boolean hasSign = false;
        int res = 0;
        for(int i=0;i<str.length();i++){
            char tem = str.charAt(i);
            if(tem=='-') {
                if (!hasSign) {
                    sign = -1;
                    hasSign = true;
                }else{
                    return 0;
                }
            }else if(tem=='+'){
                if(!hasSign){
                    sign = 1;
                    hasSign = true;
                }else{
                    return 0;
                }
            }else if(tem>='0' && tem <='9'){
                if(sign == 1&&(Integer.MAX_VALUE / 10 < res || Integer.MAX_VALUE - Integer.parseInt(String.valueOf(tem)) < res * 10 )){
                    return Integer.MAX_VALUE;
                }
                if(sign == -1&&(Integer.MIN_VALUE / 10 + res >0 || Integer.MIN_VALUE + Integer.parseInt(String.valueOf(tem)) > sign*res * 10)){
                    return Integer.MIN_VALUE;
                }
                res = res*10 + Integer.parseInt(String.valueOf(tem));
            }else{
                return res*sign;
            }
        }
        return res*sign;
    }
}
