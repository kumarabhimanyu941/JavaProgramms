package thirdPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abcdeabcdefabljhsf";
		System.out.println(longestSubstring(str));
	}

	public static String longestSubstring(String str) {

		int left = 0;
		int maxlength = 0;
		int startOfMax = 0;

		Set<Character> charSet = new HashSet();

		for (int right = 0; right < str.length(); right++) {
			char currentchar = str.charAt(right);

			// logic to find the repeating character
			while (charSet.contains(currentchar)) {
				charSet.remove(str.charAt(left));
				left++;
			}

			charSet.add(currentchar);

			if (right - left + 1 > maxlength) {
				maxlength = right - left + 1;
				startOfMax = left;
			}

		}

		return str.substring(startOfMax, startOfMax + maxlength);
	}

}
