package practice1;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterNumberWithPrefix2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(24, 67, 267, 87, 299);

		list.stream().filter(x -> String.valueOf(x).startsWith("2")).forEach(System.out::println);

	}

}
