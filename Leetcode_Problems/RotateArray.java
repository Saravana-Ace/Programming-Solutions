class Solution {
	public void rotate(int[] nums, int k) {
		k %= nums.length;

		reverseOrder(nums, 0, nums.length-1);
		reverseOrder(nums, 0, k-1);
		reverseOrder(nums, k, nums.length-1);
	}

	public int[] reverseOrder(int[] nums, int first, int last) {
		int temp = 0;
		while(first < last) {
			temp = nums[first];
			nums[first] = nums[last];
			nums[last] = temp;
			first++;
			last--;
		}
		return nums;
	}
}