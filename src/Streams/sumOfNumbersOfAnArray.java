package Streams;

import java.util.Arrays;
import java.util.List;

public class sumOfNumbersOfAnArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> array1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(intSum(array));
		System.out.println(IntegerSum(array1));

	}

	// 1)For int data type or a static array

	public static int intSum(int[] array) {

		return Arrays.stream(array).sum();

	}

	// 2)For a list if integers

	public static  int IntegerSum(List<Integer> list) {

		return list.stream().mapToInt(Integer::intValue).sum();

	}

}
