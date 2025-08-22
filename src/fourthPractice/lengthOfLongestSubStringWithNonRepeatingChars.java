package fourthPractice;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubStringWithNonRepeatingChars {

	public static void main(String[] args) {

		String str = "abcdea";
		System.out.println(lengthOfLongestSubStringWithNonRepeatingChars(str));

	}

	public static int lengthOfLongestSubStringWithNonRepeatingChars(String str) {

		int maxlength = 0;
		int left = 0;

		Set<Character> set = new HashSet();

		for (int right = 0; right < str.length(); right++) {

			// what if the characaer is already present in the set

			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(str.charAt(right));
			maxlength = Math.max(maxlength, right - left + 1);

		}

		return maxlength;
	}
}
