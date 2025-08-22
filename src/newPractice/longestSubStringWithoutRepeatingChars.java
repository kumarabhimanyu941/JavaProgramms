package newPractice;

import java.util.HashSet;
import java.util.Set;

public class longestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {

		String str = "abcdedokuhgwdto";
		System.out.println(longestSubString(str));
		
	}

	public static String longestSubString(String str) {

		int left = 0;
		int maxlength = 0;
		int startOfMax = 0;

		Set<Character> charset = new HashSet<>();

		for (int right = 0; right < str.length(); right++) {

			while (charset.contains(str.charAt(right))) {
				charset.remove(str.charAt(left));
				left++;
			}

			charset.add(str.charAt(right));

			if (right - left + 1 > maxlength) {
				maxlength = right - left + 1;
				startOfMax = left;
			}

		}
		return str.substring(startOfMax, startOfMax + maxlength);
	}

}
