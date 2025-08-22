package thirdPractice;

public class swapAlphabetsWithoutSwappingSpecialChars {

	public static void main(String[] args) {

		String str = "Test123Automation@#$API*REst";
		String newstr = swapAlphabetsWithoutSwappingSpecialChars(str);
		System.out.println(newstr);
	}

	public static String swapAlphabetsWithoutSwappingSpecialChars(String str) {

		// Normalise the string

		str = str.replaceAll("\\s", "");
		char[] array = str.toCharArray();

		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			if (!Character.isAlphabetic(array[left])) {
				left++;
			} else if (!Character.isAlphabetic(array[right])) {
				right--;
			} else {
				char temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}

		return new String(array);
	}

}
