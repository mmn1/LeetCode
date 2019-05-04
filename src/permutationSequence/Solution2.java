package permutationSequence;

public class Solution2 {
    public String getPermutation(int n, int k) {
    	if(n == 1)	return "1";
    	int pos = 0;	//当前到什么位置
    	int[] base = new int[n];
    	base[1] = base[0] = 1;
    	for(int i=2; i<n; i++) {
    		//每一个位置基数，即除去这个位置，其后所有位置可能有的排列组合个数
    		base[i] = i * base[i-1];	
    	}
    	boolean[] select = new boolean[n];	//判断是否已经被选择
    	char[] res = new char[n];	//存储字符串
    	k -= 1;	//因为依照分析k得到的排列的是k+1，所以要先-1
    	while(pos < n) {
    		int kk = k / base[n - pos - 1];
    		k %= base[n - pos - 1];
    		for(int i = 0; i < n; i++) {
    			if(!select[i]) {
    				if(kk == 0) {
    					select[i] = true;
    					res[pos++] = (char)(i+1+48);
    					break;
    				}else {
    					kk--;
    				}
    			}
    		}
    	}
    	return new String(res);
    }
}
