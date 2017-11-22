package Array;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] n = { 0, 3, 2, 0, 6, 0, 8 };
		moveZeroes(n);
		System.out.println(Arrays.toString(n));
	}

	public static void moveZeroes(int[] nums) {
		if (nums == null) {
			return;
		}

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				index++;
			}
		}
	}

	// public static void moveZeroes(int[] n) {
	// int len = n.length;
	// for(int i = 0; i < len; i++) {
	// if(n[i] == 0) {
	// for(int j = i; j < len - 1; j++) {
	// n[j] = n[j+1];
	// }
	// n[--len] = 0;
	// i--;
	// }
	// }
	// }

}
