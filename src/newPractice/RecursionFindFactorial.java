package newPractice;

public class RecursionFindFactorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));
	}

	// 5!=5*4!
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
