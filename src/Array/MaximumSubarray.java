package Array;

import java.util.Arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = {-4,-3,-9};
		System.out.println(maxSubArray2(nums));

	}
	
	public static int maxSubArray(int[] nums) {
        int max = 0;
        int temp = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) count++;
            temp += nums[i];
            if(temp < 0)
                temp = 0;
            if(max < temp)
                max = temp;
        }
        if(count == nums.length){
            Arrays.sort(nums);
            max = nums[nums.length-1];
        }
        return max;
	}
	
	public static int maxSubArray2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            sum = Math.max(sum, 0);
        }
        return max;
    }

}

