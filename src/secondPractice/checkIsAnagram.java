package secondPractice;

import java.util.HashMap;
import java.util.Map;

public class checkIsAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagramTest("silent", "listen"));
		System.out.println(isAnagramTest("silent", "listens"));
		System.out.println(isAnagramTest("test", "listen"));
		// System.out.println(isAnagramTest("", "listen"));
		// System.out.println(isAnagramTest("test", null));
		System.out.println(isAnangramTest1("silent", "listen"));
		System.out.println(isAnangramTest1("silent", "random"));
	}

	// 1)Approach 1:Using two maps
	public static Boolean isAnagramTest(String str1, String str2) {

		if (str1 == null || str1.isEmpty()) {
			throw new IllegalArgumentException("Invalid first String ");
		}
		if (str2 == null || str2.isEmpty()) {
			throw new IllegalArgumentException("Invalid String ");
		}
		// Normalize the two strings

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replace("\\s", "").toLowerCase();

		// Compare the length of the two strings

		if (str1.length() != str2.length()) {
			return false;
		}

		Map<Character, Integer> freqMap1 = new HashMap();
		Map<Character, Integer> freqMap2 = new HashMap();

		for (Character ch : str1.toCharArray()) {
			freqMap1.put(ch, freqMap1.getOrDefault(ch, 0) + 1);
		}
		for (Character ch : str2.toCharArray()) {
			freqMap2.put(ch, freqMap2.getOrDefault(ch, 0) + 1);
		}

		return freqMap1.equals(freqMap2);

	}

	// 2)Approach 2 : using one map

	public static boolean isAnangramTest1(String str1, String str2) {

		// Null and Empty check
		if (str1 == null || str1.isEmpty()) {
			throw new RuntimeException("Invalid String");
		}
		if (str2 == null || str2.isEmpty()) {
			throw new RuntimeException("Invalid String");
		}

		// Normalize the two strings

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		Map<Character, Integer> freqMap = new HashMap();

		for (Character ch : str1.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

		}

		for (Character ch : str2.toCharArray()) {
			if (!freqMap.containsKey(ch)) {
				return false;
			}

			freqMap.put(ch, freqMap.get(ch) - 1);
			if (freqMap.get(ch) == 0) {
				freqMap.remove(ch);
			}

		}
		return freqMap.isEmpty();
	}

}
