package newPractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamsfindMaxAndMin {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4);

		int max = numbers.stream().mapToInt(Integer::intValue).max().orElseThrow();
		System.out.println(max);

		int min = numbers.stream().mapToInt(Integer::intValue).min().orElseThrow();

		System.out.println(min);

	}
}
