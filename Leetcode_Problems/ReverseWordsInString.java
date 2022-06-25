class Solution {
	public String reverseWords(String s) {
		char[] letters = s.toCharArray();
		int lTwo = 0;

		for(int lOne = 0; lOne < letters.length; lOne++) {
			if(letters[lOne] == ' ') {
				reverse(letters, lTwo, lOne-1);
				lTwo = lOne + 1;
			}

			if(lOne == letters.length-1)
				reverse(letters, lTwo, lOne);
		}

		return new String(letters);
	}

	public void reverse(char[] letters, int first, int last) {
		char temp = ' ';
		while(first < last) {
			temp = letters[first];
			letters[first] = letters[last];
			letters[last] = temp;
			first++;
			last--;
		}
	}
}