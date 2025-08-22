package practice1;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		String str = "abcdeakjhgtydg";
		System.out.println(length(str));
	}

	public static int length(String str) {
		int left = 0;
		int maxlength = 0;

		Set<Character> set = new HashSet<>();

		for (int right = 0; right < str.length(); right++) {

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
