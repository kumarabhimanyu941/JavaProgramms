package practice1;

import java.util.HashSet;
import java.util.Set;

public class longestSubStringWithoutRepeatingCharcaters {

	public static void main(String[] args) {
		String str = "abcdeakjhgtydg";
		System.out.println(longestSubString(str));
	}

	public static String longestSubString(String str) {

		int left = 0;
		int maxlength = 0;
		int startOfMax = 0;
		Set<Character> set = new HashSet<>();

		for (int right = 0; right < str.length(); right++) {

			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(str.charAt(right));
			if (right - left + 1 > maxlength) {
				maxlength = right - left + 1;
				startOfMax = left;
			}
		}
		return str.substring(startOfMax, startOfMax + maxlength);
	}

}
