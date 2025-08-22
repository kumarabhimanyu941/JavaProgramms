package newPractice;

public class reverseStringWithoutReversingSpecialCharacters {

	public static void main(String[] args) {
		String str = "Abhi12ma$%^nyu";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {

		char[] array = str.toCharArray();

		int left = 0;
		int right = str.length() - 1;
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
