class Solution {
	public int[] sortedSquares(int[] nums) {
		int first = 0;
		int last = nums.length - 1;
		int[] sorted = new int[nums.length];

		int temp1 = 0;
		int temp2 = 0;
		int counter = nums.length - 1;

		while(counter >= 0) {
			temp1 = nums[first] * nums[first];
			temp2 = nums[last] * nums[last];

			if(temp1 < temp2) {
				sorted[counter] = temp2;
				last--;
			} else {
				sorted[counter] = temp1;
				first++;
			}

			counter--;
		}

		return sorted;
	}
}