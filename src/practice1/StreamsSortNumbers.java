package practice1;

import java.util.Arrays;
import java.util.List;

public class StreamsSortNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(34, 56, 345, 876, 90, 1234);

		list.sort(null);

		System.out.println(list);

		list.sort((x, y) -> (y - x));
		System.out.println(list);
	}
}
