package Array;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] n = {1,1,1,2,3,4,4,5};
		int l = RemoveDuplicate(n);
		System.out.println(l);
		System.out.println(Arrays.toString(n));
	}
	
	private static int RemoveDuplicate(int[] nums) {
		int len = nums.length;
		for(int i = 0; i < len - 1 ;i++) {
			if(nums[i] == nums[i+1]) {
				for(int j = i; j < len - 1; j++)
					nums[j] = nums[j+1];
				len--;
				i--;
			}
		}
		return len;
	}

}
