package Array;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 7, 5, 3, 2 };
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void nextPermutation(int[] nums) {

		// 从后往前判断它的子序列是否为逆序，否则继续往前找
		// 找到第一个非逆序的子序列后，把比第一个数大一点点的数跟它交换，之后的数顺序排列
		int i, j;
		for (i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1])
				break;
		}
		if (i == 0)
			Arrays.sort(nums);
		else {
			for (j = i; j < nums.length - 1; j++) {
				if (nums[i - 1] < nums[j] && nums[i - 1] >= nums[j + 1]) {
					break;
				}
			}
			int temp = nums[i - 1];
			nums[i - 1] = nums[j];
			nums[j] = temp;
			for (j = i; j < nums.length; j++) {
				temp = nums[j];
				int index = j;
				for (int k = j + 1; k < nums.length; k++) {
					if (temp > nums[k]) {
						temp = nums[k];
						index = k;
						System.out.println("index = " + index + "  min:" + temp);
					}
				}
				nums[index] = nums[j];
				nums[j] = temp;
			}
		}

	}

}
