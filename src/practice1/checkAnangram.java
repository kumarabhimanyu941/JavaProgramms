package practice1;

import java.util.HashMap;
import java.util.Map;

public class checkAnangram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		System.out.println(checkAnagramTest(str1, str2));
	}

	public static boolean checkAnagramTest(String str1, String str2) {

		Map<Character, Integer> map = new HashMap<>();

		for (Character chars : str1.toCharArray()) {
			map.put(chars, map.getOrDefault(chars, 0) + 1);

		}

		if (str1.length() != str2.length()) {
			return false;
		}
		for (Character chars : str2.toCharArray()) {
			if (!map.containsKey(chars)) {
				return false;
			} else {
				map.put(chars, map.getOrDefault(chars, 0) - 1);
				if (map.get(chars) == 0) {
					map.remove(chars);
				}
			}
		}
		return map.isEmpty();
	}
}
