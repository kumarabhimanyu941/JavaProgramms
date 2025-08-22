package newPractice;

import java.util.stream.IntStream;

public class SumOfAllEvenNumInGivenRange {

	public static void main(String[] args) {

		IntStream.range(1, 11).filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));

	}
}
