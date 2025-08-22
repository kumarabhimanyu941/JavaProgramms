package newPractice;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterNumberWithPrefix2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 23, 56, 45, 78, 290, 2345);

		numbers.stream().filter(x -> String.valueOf(x).startsWith("2")).forEach(x -> System.out.println(x));

	}

}
