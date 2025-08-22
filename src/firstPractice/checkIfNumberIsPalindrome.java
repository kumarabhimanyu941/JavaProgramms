package firstPractice;

public class checkIfNumberIsPalindrome {

	public static void main(String[] args) {

		System.out.println(checkPalindrome(121));
		System.out.println(checkPalindrome(1211));
		System.out.println(checkPalindrome(12456));
		System.out.println(checkPalindrome(1201));
		System.out.println(checkPalindrome(-1));
		System.out.println(checkPalindrome(0));
	}

	public static boolean checkPalindrome(int num) {

		if (num <= 0) {
			return false;
		}

		int original = num;
		int reverse = 0;

		while (num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}

		return original == reverse;
	}

}
