class Solution {
	public void moveZeroes(int[] nums) {
		int left = 0;
		int temp = 0;

		for (int j = 0; j < nums.length; j++) {
			if(nums[j] != 0) {
				temp = nums[j];
				nums[j] = nums[left];
				nums[left] = temp;
				left++;
			}
		}
	}
}