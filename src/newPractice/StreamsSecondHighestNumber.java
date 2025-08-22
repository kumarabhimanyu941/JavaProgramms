package newPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsSecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 56, 78, 98, 45, 67);

		int secondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow();

		System.out.println(secondHighest);

	}
}
