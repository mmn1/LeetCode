package countingBits;

public class Soution2 {
	public int[] countBits(int num) {
		int[] result = new int[num + 1];

		for (int i = 0; i <= num; i++) {
			// String s = Integer.toBinaryString(i);
			result[i] = Integer.bitCount(i);
		}

		return result;
	}

}
