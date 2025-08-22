package practice1;

public class palindromeTest {

	public static int rev;

	public static void main(String[] args) {
		int num = 121;
		System.out.println(isPalindrome(num));

	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		while (num > 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		return temp == rev;

	}

}
