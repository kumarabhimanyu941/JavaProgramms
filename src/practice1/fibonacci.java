package practice1;

public class fibonacci {

	public static void main(String[] args) {
		fibonacciTest();
	}

	public static void fibonacciTest() {
		int firstNum = 0;
		int secondNum = 1;

		System.out.print(firstNum + " " + secondNum);
		for (int i = 2; i <= 10; i++) {
			int thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			System.out.print(" " + thirdNum);
		}
	}
}
