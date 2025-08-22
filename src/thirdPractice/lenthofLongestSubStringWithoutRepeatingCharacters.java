package thirdPractice;

import java.util.HashSet;
import java.util.Set;

public class lenthofLongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abcdeabcdefabljhsf";
		System.out.println(lengthofLongestSubString(str));
	}

	public static int lengthofLongestSubString(String str) {

		int left = 0;
		int maxlength = 0;

		Set<Character> charSet = new HashSet();

		for (int right = 0; right < str.length(); right++) {
			char currentchar = str.charAt(right);

			// logic to check for repeating characters
			while (charSet.contains(currentchar)) {
				charSet.remove(str.charAt(left));
				left++;
			}

			// adding the current character to the Set
			charSet.add(currentchar);
			maxlength = Math.max(maxlength, right - left + 1);

		}

		return maxlength;
	}

}
