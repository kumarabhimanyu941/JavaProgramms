package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 45, 34, 56, 78, 22, 34);

		List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);

	}

}
