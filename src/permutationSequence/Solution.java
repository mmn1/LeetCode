package permutationSequence;

//֮ǰ��Ҫ�Ƿ������󣬰�k+1λ����kλ������´���
public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int[] storeNum = new int[n];
        for(int j=0; j<n; j++) {
        	storeNum[j] = j+1;
        }
        if(k == 1) {
        	StringBuilder ss = new StringBuilder();
        	for(int j=1; j<=n; j++) {
            	ss.append(j);
            }
        	return ss.toString();
        }
        int currentNum = n, i = 0;
        int tmp = getTimes(--currentNum);
        while(tmp >= k) {
        	storeNum[i] = 0;
        	i++;		//1
        	sb.append(i);
        	tmp = getTimes(--currentNum);
        }
//        i++;	//2
        k -= 1;
        while(k > 0) {
        	int kk = k / tmp;
        	for(int j=i; j<n; j++) {
        		if(storeNum[j] != 0) {
	        		if(kk == 0) {
	        			sb.append(storeNum[j]);
	                	storeNum[j] = 0;
	                	break;
	        		}else {
	        			kk--;
	        		}
        		}
        	}
        	k = k % tmp;
        	tmp = getTimes(--currentNum);
        }
        for(int j=0; j<n; j++) {
        	if(storeNum[j] != 0) {
        		sb.append(storeNum[j]);
        	}
        }
        return sb.toString();
    }
//     ��ȡһ�����Ľ׳�
    public int getTimes(int n) {
    	int res = 1;
    	while(n >= 1) {
    		res *= n--;
    	}
    	return res == 0 ? 1 : res;	//ȷ��0�Ľ׳���1
    }
}
