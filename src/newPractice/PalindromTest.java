package newPractice;

public class PalindromTest {

	public static void main(String[] args) {

		System.out.println(checkPalindrome(123));
		System.out.println(checkPalindrome(121));
	}

	public static boolean checkPalindrome(int num) {

		int rev = 0;
		int temp = num;

		while (num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;

		}

		return rev == temp;

	}
}
