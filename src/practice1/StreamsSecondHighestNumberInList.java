package practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsSecondHighestNumberInList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		int secondhighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondhighest);

		int secondhighest1 = list.stream().sorted((x, y) -> (y - x)).skip(1).findFirst().get();
		System.out.println(secondhighest1);

	}

}
