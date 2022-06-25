class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length-1, sum = 1001;

		while(sum != target) {
			sum = numbers[left] + numbers[right];

			if(sum > target)
				right--;
			else
				left++;
		}

		return new int[] {left,right + 1};
	}
}