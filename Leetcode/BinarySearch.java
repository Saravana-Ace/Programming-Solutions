class Solution {
	public int search(int[] nums, int target) {
		int first = 0;
		int last = nums.length-1;
		int middle;

		while(first <= last) {
			/* can calculate middle as:
				middle = first + (last - first)/2
				in order to avoid overflow
			 */

			middle = (first + last)/2;

			if (target == nums[middle])
				return middle;
			if(target > nums[middle])
				first = (middle)+1;
			else
				last = (middle)-1;
		}

		return -1;
	}
}