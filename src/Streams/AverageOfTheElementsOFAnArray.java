package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfTheElementsOFAnArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, };
		OptionalDouble average = average(array);
		if (average.isPresent()) {
			System.out.println(average.getAsDouble());
		}

	}

	public static OptionalDouble average(int[] array) {

		return Arrays.stream(array).average();

	}

	public static OptionalDouble average1(Integer[] array) {

		return Arrays.stream(array).mapToInt(Integer::intValue).average();

	}

	public static OptionalDouble average3(List<Integer> list) {

		return list.stream().mapToInt(Integer::intValue).average();

	}
}
