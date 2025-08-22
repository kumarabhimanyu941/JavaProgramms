package firstPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class countOfVowelsAndConsonants {

	public static void main(String[] args) {
		String str = "Abhimanyu";
		countOfVowelsAndConsonants(str);
	}

	public static void countOfVowelsAndConsonants(String str) {

		// Nomalize the String
		str = str.replaceAll("\\s", "").toLowerCase();

		Map<Character, Integer> vowelsMap = new HashMap<>();
		Map<Character, Integer> consonantsMap = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				if ("aeiou".indexOf(ch) != -1) {
					vowelsMap.put(ch, vowelsMap.getOrDefault(ch, 0) + 1);
				} else {
					consonantsMap.put(ch, consonantsMap.getOrDefault(ch, 0) + 1);
				}
			}
		}
		System.out.println("Vowels map: ");
		for (Entry<Character, Integer> entry : vowelsMap.entrySet()) {

			System.out.print(" " + entry.getKey() + "--" + entry.getValue() + ";");

		}
		System.out.println();
		System.out.println("Consonants Map: ");
		for (Entry<Character, Integer> entry : consonantsMap.entrySet()) {

			System.out.print(" " + entry.getKey() + "--" + entry.getValue() + ";");

		}

	}

}
