package Array;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] nums = {2,3,3,5};
		int value = 5;
		System.out.println(removeElement(nums,value));

	}
	
	public static int removeElement(int[] nums, int val) {
		int len = nums.length;
	    for(int i = 0; i < len ; i++) {
	    	if(nums[i] == val) {
	    		len--;
	    		nums[i] = nums[len];
	    		i--;
	    	}
	    }
		return len;
	}

}
