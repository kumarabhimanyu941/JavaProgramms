package firstPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharcaters {

	public static void main(String[] args) {
		System.out.println(LongestSubStringWithoutRepeatingCharcaters("abcdeff"));
	}

	public static String LongestSubStringWithoutRepeatingCharcaters(String str) {

		int left = 0;
		int maxlength = 0;
		int startOfMax = 0;// to remember the starting index of longest substring
		Set<Character> set = new HashSet();

		for (int right = 0; right < str.length(); right++) {
			char currentcharacter = str.charAt(right);

			// Logic to slide the window forward if the character is already present in the
			while (set.contains(currentcharacter)) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(currentcharacter);

			// fetching the longest substring

			if (right - left + 1 > maxlength) {
				maxlength = right - left + 1;
				startOfMax = left;
			}
		}
		return str.substring(startOfMax, startOfMax + maxlength);
	}

}
