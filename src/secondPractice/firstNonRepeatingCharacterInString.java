package secondPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class firstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingCharacter("abbcdac"));
	}

	public static Object firstNonRepeatingCharacter(String str) {

		// Null and Empty check
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Invalid String");
		}

		// Normalize the string
		str = str.replaceAll("\\s", "").toLowerCase();

		Map<Character, Integer> freqMap = new LinkedHashMap();

		for (Character ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}

		for (Entry<Character, Integer> entry : freqMap.entrySet()) {

			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}

}
