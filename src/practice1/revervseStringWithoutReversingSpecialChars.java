package practice1;

public class revervseStringWithoutReversingSpecialChars {

	public static void main(String[] args) {
		String str = "Epam123Int%$^erview";
		reverse(str);

	}

	public static void reverse(String str) {

		StringBuilder builder = new StringBuilder();
		for (Character chars : str.toCharArray()) {
			if (Character.isAlphabetic(chars)) {
				builder.append(chars);
			} else {
				System.out.print(reverseString(builder));
				builder.setLength(0);
				System.out.print(chars);
			}
		}
		System.out.print(reverseString(builder));

	}

	public static StringBuilder reverseString(StringBuilder builder) {
		return builder.reverse();

	}

}
