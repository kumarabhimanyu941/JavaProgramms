package newPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class firstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		String str = "aabbccddf";
		firstNonRepeatingChar(str);
	}

	public static void firstNonRepeatingChar(String str) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (Character chars : str.toCharArray()) {
			map.put(chars, map.getOrDefault(chars, 0) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
