package thirdPractice;

public class PalindromeOrNumberReverse {

	public static void main(String[] args) {
		System.out.println(checkPalindrome(1221));
	}

	public static boolean checkPalindrome(int num) {

		int temp = num;
		int reverse = 0;

		while (num > 0) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		return reverse == temp;
	}

}
