package firstPractice;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementsInArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 5, 1, 2 };
		findDuplicate(array);
	}

	public static void findDuplicate(int[] array) {

		Set<Integer> seen = new HashSet();
		Set<Integer> duplicates = new HashSet();

		for (int value : array) {
			if (!seen.add(value)) {
				duplicates.add(value);
			}
		}

		System.out.println("Duplicates value are" + duplicates);

	}
}
