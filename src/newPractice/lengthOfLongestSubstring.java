package newPractice;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {

	public static void main(String[] args) {
		String str = "abcdedokuhgwdto";
		System.out.println(lengthOfLongestSubString(str));
	}

	public static int lengthOfLongestSubString(String str) {

		int left = 0;
		int maxlength = 0;

		Set<Character> charset = new HashSet<>();
		for (int right = 0; right < str.length(); right++) {

			while (charset.contains(str.charAt(right))) {
				charset.remove(str.charAt(left));
				left++;

			}

			charset.add(str.charAt(right));
			maxlength = Math.max(maxlength, right - left + 1);

		}

		return maxlength;
	}

}
