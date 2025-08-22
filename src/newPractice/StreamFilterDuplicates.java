package newPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4);

		numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1).distinct()
				.forEach(n -> System.out.println(n));

		List<Integer> duplicates = numbers.stream().filter(x -> Collections.frequency(numbers, x) > 1).distinct()
				.collect(Collectors.toList());
		System.out.println("Duplicates::" + duplicates);
	}

}
