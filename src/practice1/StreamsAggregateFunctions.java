package practice1;

import java.util.Arrays;
import java.util.List;

public class StreamsAggregateFunctions {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 45, 67, 87, 34, -90);

		int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println(max);
		int min = list.stream().mapToInt(x -> x.intValue()).min().getAsInt();
		System.out.println(min);

		double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(average);
	}
}
