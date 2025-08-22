package firstPractice;

public class reverseString {

	public static void main(String[] args) {
		System.out.println(StringReverseUsingIndex("Abhimanyu"));
		System.out.println(StringReverse("stringbuiler"));
	}

	public static String StringReverseUsingIndex(String str) {
		String rev = "";
		if (str == null || str.length() <= 1) {
			return str;
		}
		char ch[] = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + ch[i];

		}
		return rev;
	}

	public static String StringReverse(String str) {
		String reverse = "";
		if (str == null || str.length() <= 1) {
			return str;
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return str;
	}

}
