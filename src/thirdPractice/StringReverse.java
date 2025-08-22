package thirdPractice;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(stringReverse1("Selenium"));
		System.out.println(stringReverse2("Automation"));
	}

	// 1) Approach 1
	public static String stringReverse1(String str) {
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("The given string is either null or empty");
		}
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

	// 2)Approach 2
	public static String stringReverse2(String str) {
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("The given string is either null or empty");
		}
		String reverse = "";
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}

		return reverse;
	}

}
