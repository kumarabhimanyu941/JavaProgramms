package LambdaExpAndFIs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorInterfaceListSort {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 5, 34, 76, 56, 987, 234);

		Collections.sort(list);
		// The natural sorting order using the sort method is ascending order
		// If we want to do a custom sorting,or sort in descending order,we need to pass
		// a Comparator object
		System.out.println(list);
		Collections.sort(list, (x, y) -> (y - x));
		System.out.println(list);
	}

}
