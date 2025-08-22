package newPractice;

import java.util.HashMap;
import java.util.Map;

public class checkAnagram {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		String str3 = "silents";
		System.out.println(anagramTestUsingTwoMaps(str1, str2));
		System.out.println(anagramTestUsingTwoMaps(str1, str3));
		System.out.println("---------");
		System.out.println(anangramTestUsingOneMap(str1, str2));
		System.out.println(anangramTestUsingOneMap(str1, str3));
	}

	// 1 Using Two Maps
	public static boolean anagramTestUsingTwoMaps(String str1, String str2) {

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		for (Character chars : str1.toCharArray()) {
			map1.put(chars, map1.getOrDefault(chars, 0) + 1);
		}

		for (Character chars : str2.toCharArray()) {
			map2.put(chars, map2.getOrDefault(chars, 0) + 1);
		}

		return map1.equals(map2);
	}

	// 2 Using one Map

	public static boolean anangramTestUsingOneMap(String str1, String str2) {

		Map<Character, Integer> map = new HashMap<>();

		for (Character chars : str1.toCharArray()) {
			map.put(chars, map.getOrDefault(chars, 0) + 1);
		}

		for (Character chars : str2.toCharArray()) {
			if (!map.containsKey(chars)) {
				return false;
			}

			map.put(chars, map.getOrDefault(chars, 0) - 1);
			if (map.get(chars) == 0) {
				map.remove(chars);
			}

		}
		return map.isEmpty();

	}

}
