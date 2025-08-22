package firstPractice;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubStringWithoutRepeatingCharactersTest("abcdeff"));
	}

	public static int lengthOfLongestSubStringWithoutRepeatingCharactersTest(String str) {

		int left = 0;
		int maxlength = 0;
		Set<Character> set = new HashSet();

		for (int right = 0; right < str.length(); right++) {
			char currentchar = str.charAt(right);

			// Sliding window logic
			while (set.contains(currentchar)) {
				set.remove(str.charAt(left));
				left++;
			}

			// Adding characters to the set and maintaining the length
			set.add(currentchar);
			maxlength = Math.max(maxlength, right - left + 1);

		}
		
		return maxlength;

	}
}
