package practice1;

public class rotationalStrings {

	public static void main(String[] args) {
		checkRotational("abcd", "dabc");
	}

	public static void checkRotational(String str1, String str2) {

		if (str1.length() != str2.length()) {
			System.out.println("not rotational");
		}

		String doubled = str1 + str1;
		if (doubled.contains(str2)) {
			System.out.println("rotational");
		} else {
			System.out.println("not rotational");
		}

	}
}
