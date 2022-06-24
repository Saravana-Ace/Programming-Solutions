public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int first = 1;
		int last = n;
		int mid;

		while(first <= last) {
			mid = first + (last - first)/2;

			if(isBadVersion(mid))
				if(isBadVersion(mid-1))
					last = mid-1;
				else
					return mid;
			else
			if(isBadVersion(mid+1))
				return mid+1;
			else
				first = mid+1;
		}
		return -1;
	}
}