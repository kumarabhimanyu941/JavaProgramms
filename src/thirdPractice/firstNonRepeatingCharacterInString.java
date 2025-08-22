package thirdPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class firstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		String str = "abcdefgabcde";
		findFirstNonRepeatingCharacter(str);
	}

	public static void findFirstNonRepeatingCharacter(String str) {

		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Invalid value as parameter " + str);
		}

		str = str.replaceAll("\\s", "").toLowerCase();

		Map<Character, Integer> freqMap = new LinkedHashMap();

		for (Character ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

		}

		Set<Entry<Character, Integer>> entries = freqMap.entrySet();

		for (Entry<Character, Integer> entry : entries) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + " is the first non repeating character in the String");
				break;
			}
		}
	}
}
