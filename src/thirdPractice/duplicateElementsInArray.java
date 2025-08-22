package thirdPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class duplicateElementsInArray {

	public static void main(String[] args) {
		String[] array = { "Java", "Selenium", "Java", "Automation", "API", "API" };
		findDuplicatesInArray(array);
	}

	public static void findDuplicatesInArray(String[] array) {

		Set<String> unique = new HashSet();
		Set<String> duplicate = new HashSet();

		for (String str : array) {
			if (!unique.add(str)) {
				duplicate.add(str);
			}
		}

		Iterator<String> it = duplicate.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
