package secondPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class sortArrayInAscendingOrder {

	public static void main(String[] args) {

		int[] array = { 10, -110, 0, 567, 9823, 100 };
		secondLargestElementInArray(array);
	}

	public static void secondLargestElementInArray(int[] array) {

		Set<Integer> intSet = new TreeSet();

		for (int value : array) {
			if (!intSet.contains(value)) {
				intSet.add(value);
			}
		}

		Iterator iterator = intSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
