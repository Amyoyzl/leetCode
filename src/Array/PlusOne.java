package Array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] n = { 9, 9, 9, 9 };
		System.out.println(Arrays.toString(plusOne(n)));
	}

	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		digits[len - 1]++;
		for (int i = len - 1; i > 0; i--) {
			if (digits[i] > 9) {
				digits[i] = 0;
				digits[i - 1]++;
			} else
				break;
		}
		if (digits[0] < 10)
			return digits;
		else {
			int[] result = new int[len + 1];
			result[0] = 1;
			result[1] = 0;
			for (int i = 2; i < len + 1; i++) {
				result[i] = digits[i - 1];
			}
			return result;
		}
	}

}