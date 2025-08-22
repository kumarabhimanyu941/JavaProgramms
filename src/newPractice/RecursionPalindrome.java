package newPractice;

public class RecursionPalindrome {

	public static void main(String[] args) {
		// num=121

		System.out.println(reverse(121));
	}

	public static int reverseHelper(int num, int rev) {

		if (num == 0) {
			return rev;
		}

		rev = rev * 10 + num % 10;
		return reverseHelper(num / 10, rev);
	}

	public static int reverse(int num) {
		return reverseHelper(num, 0);
	}
}
