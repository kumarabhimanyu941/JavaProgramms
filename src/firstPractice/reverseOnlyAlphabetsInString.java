package firstPractice;

public class reverseOnlyAlphabetsInString {

	public static void main(String[] args) {

		String str = "25Auto34mation87Rest54Assured";
		reverseOnlyAlphabets(str);

	}

	public static void reverseOnlyAlphabets(String str) {

		char[] charArray = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char currentCharacter : charArray) {
			if (Character.isAlphabetic(currentCharacter)) {
				builder.append(currentCharacter);
			} else {
				reverseString(builder);
				System.out.print(currentCharacter);
			}
			
		}
		reverseString(builder);

	}

	public static void reverseString(StringBuilder builder) {
		System.out.print(builder.reverse());
		builder.setLength(0);
	}

}
