package newPractice;

public class reverseStringWithoutReversingSpecialChars {

	static String rev = "";

	public static void main(String[] args) {
		String str = "Epam123Int@&^erview";
		stringReverse(str);

	}

	public static void stringReverse(String str) {

		char[] array = str.toCharArray();
		StringBuilder builder = new StringBuilder();

		for (Character chars : array) {
			if (Character.isAlphabetic(chars)) {
				builder.append(chars);

			} else {
				reverse(builder);
				System.out.print(chars);
			}
		}
		reverse(builder);

	}

	public static void reverse(StringBuilder builder) {
		System.out.print(builder.reverse());
		builder.setLength(0);

	}
}
