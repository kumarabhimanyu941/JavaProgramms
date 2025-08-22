package firstPractice;

import java.util.HashMap;
import java.util.Map;

public class checkAnagram {

	public static void main(String[] args) {

		boolean flag1 = checkIsAnagram1("silents", "listen");

		if (flag1 == true) {
			System.out.println("two strings are anagram");
		} else {
			System.out.println("two strings are not anagram");
		}

		boolean flag2 = checkIsAnagram2("silents", "listen");

		if (flag2 == true) {
			System.out.println("two strings are anagram");
		} else {
			System.out.println("two strings are not anagram");
		}

	}

	// 1) First way using one two maps
	public static boolean checkIsAnagram1(String str1, String str2) {

		// 1.Normalize the two strings
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// 2.Compare the length of two Strings
		if (str1.length() != str2.length())
			return false;

		// 3.Add the two strings to Maps

		Map<Character, Integer> map1 = new HashMap();
		Map<Character, Integer> map2 = new HashMap();

		for (Character ch : str1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}

		for (Character ch : str2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}

		// 4.Compare the two maps
		return map1.equals(map2);
	}

	// 2) Second way using one map

	public static boolean checkIsAnagram2(String str1, String str2) {

		// 1)Normalize the two strings

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length())
			return false;

		Map<Character, Integer> map = new HashMap();

		for (Character ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		for (Character ch : str2.toCharArray()) {
			if (!map.containsKey(ch))
				return false;

			map.put(ch, map.get(ch) - 1);

			if (map.get(ch) == 0)
				map.remove(ch);
		}

		return map.isEmpty();

	}

}
