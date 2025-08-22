package newPractice;

public class RecursionStringReverse {

	public static void main(String[] args) {

		System.out.println(stringReverse("epam"));
	}

	public static String stringReverse(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}

		return str.charAt(str.length() - 1) + stringReverse(str.substring(0, str.length() - 1));

	}

}
