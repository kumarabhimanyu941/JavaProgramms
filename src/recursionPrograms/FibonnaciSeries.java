package recursionPrograms;

public class FibonnaciSeries {

	public static void main(String[] args) {

		System.out.println(fib(5));
		for (int i = 0; i < 9; i++) {
			System.out.print(fib(i) + " ");
		}
	}

	// 0 1 1 2 3 5 8

	public static int fib(int n) {

		if (n <= 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);

	}
}
