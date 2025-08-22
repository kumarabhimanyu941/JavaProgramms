package newPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicatesInAnArray {

	public static void main(String[] args) {

		String[] array = { "Java", "Selenium", "Epam", "Java" };
		findDuplicates(array);

	}

	public static void findDuplicates(String[] array) {

		Map<String, Integer> map = new HashMap<>();

		for (String str : array) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}

		}

	}
}