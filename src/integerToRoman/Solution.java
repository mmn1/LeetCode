package integerToRoman;

public class Solution {
	public String intToRoman(int num) {
		int[] n = {0, 0, 0, 0};
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<4; i++) {
			n[i] = num % 10;
			num = num / 10;
		}
		if(n[3]!=0) {
			switch(n[3]) {
			case 1:
				sb.append('M');
				break;
			case 2:
				sb.append("MM");
				break;
			case 3:
				sb.append("MMM");
				break;
			default:
				break;
			}
		}
		
		if(n[2]!=0) {
			switch(n[2]) {
			case 1:
				sb.append('C');
				break;
			case 2:
				sb.append("CC");
				break;
			case 3:
				sb.append("CCC");
				break;
			case 4:
				sb.append("CD");
				break;
			case 5:
				sb.append("D");
				break;
			case 6:
				sb.append("DC");
				break;
			case 7:
				sb.append("DCC");
				break;
			case 8:
				sb.append("DCCC");
				break;
			case 9:
				sb.append("CM");
				break;
			default:
				break;
			}
		}
		
		if(n[1]!=0) {
			switch(n[1]) {
			case 1:
				sb.append('X');
				break;
			case 2:
				sb.append("XX");
				break;
			case 3:
				sb.append("XXX");
				break;
			case 4:
				sb.append("XL");
				break;
			case 5:
				sb.append("L");
				break;
			case 6:
				sb.append("LX");
				break;
			case 7:
				sb.append("LXX");
				break;
			case 8:
				sb.append("LXXX");
				break;
			case 9:
				sb.append("XC");
				break;
			default:
				break;
			}
		}
		
		if(n[0]!=0) {
			switch(n[0]) {
			case 1:
				sb.append('I');
				break;
			case 2:
				sb.append("II");
				break;
			case 3:
				sb.append("III");
				break;
			case 4:
				sb.append("IV");
				break;
			case 5:
				sb.append("V");
				break;
			case 6:
				sb.append("VI");
				break;
			case 7:
				sb.append("VII");
				break;
			case 8:
				sb.append("VIII");
				break;
			case 9:
				sb.append("IX");
				break;
			default:
				break;
			}
		}
		return sb.toString();
	}
}
