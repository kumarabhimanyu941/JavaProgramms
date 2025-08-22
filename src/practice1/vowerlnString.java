package practice1;

import java.util.HashSet;
import java.util.Set;

public class vowerlnString {

	public static void main(String[] args) {
		String str = "Abhimanyu";
		vowelsTest(str);
	}

	public static void vowelsTest(String str) {

		Set<Character> vowels = new HashSet<>();

		for (Character chars : str.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(chars) != -1) {
				vowels.add(chars);
			}
		}
		for (Character chars : vowels) {
			System.out.print(" " + chars);
		}

	}
}
