class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}

		String result = "";
		int max = 0;

		for(int i = 0; i < s.length(); i++) {
			if(!result.contains(s.substring(i,i+1))) {
				result += s.substring(i,i+1);
			}
			else {
				result = result.substring(result.indexOf(s.substring(i, i+1))+1) + s.substring(i, i+1);
			}

			if(result.length() > max)
				max = result.length();
		}

		return max;
	}
}