package fourthPractice;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abcdeafghijklm";
		System.out.println(longestSubstringWithoutRepeatingCharacters(str));
	}

	public static String longestSubstringWithoutRepeatingCharacters(String str) {

		int left = 0;
		int maxlength = 0;
		int startOfMax = 0;
		Set<Character> set = new HashSet();

		for (int right = 0; right < str.length(); right++) {

			// what if the character that i am trying to add is already present in the set

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
