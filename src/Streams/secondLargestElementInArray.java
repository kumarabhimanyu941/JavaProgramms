package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class secondLargestElementInArray {

	public static void main(String[] args) {

		int array[] = { 1, 67, 54, 345, 987, 56, 342 };
		secondLargestElement1(array);
		int result=secondLargestElement2(array);
		System.out.println(result);
	}

	public static void secondLargestElement1(int[] array) {

		List<Integer> result = Arrays.stream(array).boxed().sorted((x, y) -> y - x).distinct().limit(2).skip(1)
				.collect(Collectors.toList());

		System.out.println(result);
	}

	public static int secondLargestElement2(int[] array) {

		return Arrays.stream(array).
				boxed().
				sorted((x, y) -> y - x).
				distinct().
				skip(1).
				findFirst()
				.orElseThrow(() -> new IllegalArgumentException("No second larget element"));

	}
}