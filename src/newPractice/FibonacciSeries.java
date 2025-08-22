package newPractice;

public class FibonacciSeries {

	public static void main(String[] args) {

		fibonacciSeries();
	}

	public static void fibonacciSeries() {
		int first = 0;
		int second = 1;

		System.out.print(first + "\t" + second);
		for (int i = 2; i <= 10; i++) {
			int third = first + second;
			first = second;
			second = third;

			System.out.print("\t" + third);
		}
	}

}
