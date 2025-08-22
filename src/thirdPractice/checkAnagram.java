package thirdPractice;

import java.util.HashMap;
import java.util.Map;

public class checkAnagram {

	public static void main(String[] args) {
		System.out.println(checkIsAnagram("silent", "listen"));
		System.out.println(checkIsAnagram("random", "listen"));
		System.out.println("--------------------------------");
		System.out.println(checkAnagram2("silent", "listen"));
		System.out.println(checkAnagram2("random", "listen"));
	}

	// 1)Approach 1 - Using two maps

	public static boolean checkIsAnagram(String str1, String str2) {
		if (str1 == null || str1.isEmpty()) {
			throw new IllegalArgumentException("Inavlid value for string " + str1);
		}
		if (str2 == null || str2.isEmpty()) {
			throw new IllegalArgumentException("Inavlid value for string " + str2);
		}

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

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

	// 2) Approach 2 - Using one Map

	public static boolean checkAnagram2(String str1, String str2) {

		if (str1 == null || str1.isEmpty()) {
			throw new IllegalArgumentException("Invalid argument for " + str1);
		}

		if (str1 == null || str1.isEmpty()) {
			throw new IllegalArgumentException("Invalid argument for " + str1);
		}

		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");

		Map<Character, Integer> freqMap = new HashMap();
		for (Character ch : str1.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}

		for (Character ch : str2.toCharArray()) {
			if (!freqMap.containsKey(ch)) {
				return false;
			}

			freqMap.put(ch, freqMap.getOrDefault(ch, 0) - 1);
			if (freqMap.get(ch) == 0) {
				freqMap.remove(ch);
			}
		}

		return freqMap.isEmpty();

	}

}
