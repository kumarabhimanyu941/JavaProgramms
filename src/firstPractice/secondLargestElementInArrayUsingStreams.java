package firstPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class secondLargestElementInArrayUsingStreams {

	public static void main(String[] args) {

		int[] array = { 10, -100, 20, -1, 89, 1, 1 };

		OptionalInt secondLargest = Arrays.stream(array).boxed()// This will convert primitive int to Integer object
				.distinct().sorted(Comparator.reverseOrder()).skip(0).mapToInt(Integer::intValue).findFirst();

		if (secondLargest.isPresent()) {
			System.out.println(secondLargest.getAsInt() + " is the second largest value");
		}

		else {
			System.out.println("Second largest value does not exist");
		}

	}
}
