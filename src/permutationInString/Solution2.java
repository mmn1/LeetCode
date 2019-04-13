package permutationInString;

public class Solution2 {
	public boolean checkInclusion(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		if(arr1.length > arr2.length)	return false;
		int res = 0;
		int[] tmp = new int[26];
		for(int i=0; i<arr1.length; i++) {
			tmp[arr1[i] - 'a']++;
			tmp[arr2[i] - 'a']--;
		}
		for(int i=0; i<26; i++) {
			if(tmp[i] != 0) {
				res++;
			}
		}
		for(int i=arr1.length; i<arr2.length && res != 0; i++) {
			tmp[arr2[i-arr1.length] - 'a']++;
			if(tmp[arr2[i-arr1.length] - 'a'] == 0) {
				res--;
			}else if(tmp[arr2[i-arr1.length] - 'a'] == 1){
				res++;
			}
			tmp[arr2[i] - 'a']--;
			if(tmp[arr2[i] - 'a'] == 0) {
				res--;
			}else if(tmp[arr2[i] - 'a'] == -1){
				res++;
			}
		}
		return res == 0;
	}
}
