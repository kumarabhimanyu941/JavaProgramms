package LambdaExpAndFIs;

import java.util.function.Function;

public class FunctionTest {

	// Function accepts something and will return something

	public static void main(String[] args) {
		Function<Integer, Integer> function = x -> x * x;

		System.out.println(function.apply(4));
	}
}
