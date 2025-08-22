package secondPractice;

public class checkNumberIsPalindrome {

	public static void main(String[] args) {
		System.out.println(isNumberPalindromeTest(123));
		System.out.println(isNumberPalindromeTest(467));
		System.out.println(isNumberPalindromeTest(121));

	}

	public static boolean isNumberPalindromeTest(int num) {
		int temp = num;
		int reverse = 0;

		while (num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}

		return reverse == temp;

	}

}
