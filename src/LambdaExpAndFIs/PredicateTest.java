package LambdaExpAndFIs;

import java.util.function.Predicate;

public class PredicateTest {

	// a predicate accepts a functions that will return a boolean
	public static void main(String[] args) {

		Predicate<Integer> isGreaterThan = x -> (x > 1000);
		System.out.println(isGreaterThan.test(100));
		System.out.println(isGreaterThan.test(11000));

		Predicate<String> startsWithV = x -> x.toLowerCase().startsWith("v");
		System.out.println(startsWithV.test("Abhimanyu"));
		Predicate<String> endsWithA = x -> x.toLowerCase().charAt(x.length() - 1) == 'a';
		System.out.println(endsWithA.test("Shampa"));
	}

}
