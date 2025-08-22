package practice1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class firstNonRepeatingCharacter {

	public static char nonRepeatingCharcater;

	public static void main(String[] args) {
		String str = "aabbcddefft";
		System.out.println(firstNonRepeatingCharacterTest(str));

	}

	public static char firstNonRepeatingCharacterTest(String str) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (Character chars : str.toCharArray()) {
			map.put(chars, map.getOrDefault(chars, 0) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				nonRepeatingCharcater = entry.getKey();
				break;
			}
		}
		return nonRepeatingCharcater;
	}
}
