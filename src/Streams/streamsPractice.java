package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsPractice {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 67, 54, 987, 123, 456, 987, 100, 100, 60, 78, 60);
		List filteredList = list.stream().
				            filter(x -> x % 2 == 0).
				            map(x -> x / 2).
				            distinct().
				            sorted((a, b) -> (b - a))
				            .limit(5).
				            skip(1).
				            peek(x->System.out.println(x)).
				            collect(Collectors.toList());

		

	}

}
