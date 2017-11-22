package Array;

import java.util.Arrays;

public abstract class TwoSum {

	public static void main(String[] args) {

		int[] nums = {2,6,3,4,8,9,23,1,5};
		int sum = 13;
		int[] buffer = new int[nums.length];
		for(int n = 0; n < nums.length;n++) {
			buffer[n] = nums[n];
		}
		Arrays.sort(buffer);
		int temp = 0;
		int i = 0, j = buffer.length - 1;
		while( i < j) {
			temp = buffer[i] + buffer[j];
			if(temp == sum)
				break;
			else if(temp < sum)
				i++;
			else j--;
		}
		int[] index = new int[2];
		int m = 0;
		for(int k = 0; k < nums.length - 1; k++) {
			if(buffer[i] == nums[k] || buffer[j] == nums[k]) {
				index[m] = k;
				m++;
			}	
		}
		System.out.println(Arrays.toString(index));

	}

}



//import java.util.Arrays;
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] buffer = new int[nums.length];
//		for(int k = 0; k < nums.length; k++) {
//			buffer[k] = nums[k];
//		}
//		Arrays.sort(buffer);
//		int temp = 0;
//		int i = 0, j = buffer.length - 1;
//		while( i < j) {
//			temp = buffer[i] + buffer[j];
//			if(temp == target)
//				break;
//			else if(temp < target)
//				i++;
//			else j--;
//		}
//		int[] index = new int[2];
//		int m = 0;
//		for(int k = 0; k < nums.length; k++) {
//			if(buffer[i] == nums[k] || buffer[j] == nums[k]) {
//				index[m] = k;
//				m++;
//			}	
//		}
//        return index;
//    }
//}






