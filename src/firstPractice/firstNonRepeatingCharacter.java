package firstPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class firstNonRepeatingCharacter {

	public static void main(String[] args) {

		Object obj = firstNonRepeatingCharacterTest(" aabbdedf");
		if (obj != null) {
			System.out.println(obj + " is the first non repeating character");
		} else {
			System.out.println("No unique charcters in the String");
		}

	}

	public static Object firstNonRepeatingCharacterTest(String str) {

		// 1)Normalize the String

		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Given String is either null or empty");
		}
		str = str.replaceAll("\\s", "").toLowerCase();

		Map<Character, Integer> freqMap = new LinkedHashMap<Character, Integer>();

		for (Character ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}

		Set<Entry<Character, Integer>> entrySet = freqMap.entrySet();

		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}

		}
		return null;

	}

}
