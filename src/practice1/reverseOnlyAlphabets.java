package practice1;

public class reverseOnlyAlphabets {

	public static void main(String[] args) {
		String str = "Epam1234Interview";
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {

		int left = 0;
		int right = str.length()-1;
		char[] array = str.toCharArray();

		while (left < right) {
			if (!Character.isAlphabetic(array[left])) {
				left++;
			} else if (!Character.isAlphabetic(array[right])) {
				right--;
			} else {
				char temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				left++;
				right--;

			}
		}
		return new String(array);
	}

}
