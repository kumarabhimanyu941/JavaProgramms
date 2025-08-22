package firstPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfCharactersInAString {

	public static void main(String[] args) {
		String str = "Abhimanyu";
		charcatersFreuency(str);
	}

	public static void charcatersFreuency(String str) {

		if (str == null || str.isEmpty()) {
			System.out.println("The given string is null or empty");
		}

		str = str.replaceAll("\\s", "").toLowerCase();

		Map<Character, Integer> freqMap = new HashMap();
		for (Character ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}

		for (Entry<Character, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}
	}
}
