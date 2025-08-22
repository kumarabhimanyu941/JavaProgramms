package practice1;

import java.util.Arrays;
import java.util.List;

public class StreamFindSquareOfEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		long count = list.stream().count();
		System.out.println("Count::" + count);

		list.stream().map(n -> n * n).forEach(System.out::println);
		list.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));

	}
}
