package newPractice;

import java.util.HashSet;
import java.util.Set;

public class vowelsInAString {

	public static void main(String[] args) {
		String str = "Epam123";
		findVowelsInString(str);

	}

	public static void findVowelsInString(String str) {

		Set<Character> vowels = new HashSet<>();
		Set<Character> consonants = new HashSet<>();
		for (Character chars : str.toLowerCase().toCharArray()) {
			if (Character.isAlphabetic(chars)) {
				if ("aeiou".indexOf(chars) == -1) {
					consonants.add(chars);
				} else {
					vowels.add(chars);
				}
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}

}
