package recursionPrograms;

public class CheckNumberPalindrome {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;

		int reversed = checkPalindromeUsingRecusrion(num, 0);

		if (temp == reversed) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public static int checkPalindromeUsingRecusrion(int num, int rev) {

		if (num == 0) {
			return rev;
		}
		rev = rev * 10 + num % 10;

		return checkPalindromeUsingRecusrion(num / 10, rev);

	}
}
