package secondPractice;

public class swapCharactersofStringWithoutReversingSpecialCharacters {

	public static void main(String[] args) {
		System.out.println(swap("random@123&"));
	}

	public static String swap(String str) {

		// 1) Null and empty check

		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Invalid String");
		}

		int left = 0;
		int right = str.length() - 1;

		char[] ch = str.toCharArray();

		while (left < right) {

			if (!Character.isLetter(ch[left])) {
				left++;
			}

			else if (!Character.isLetter(ch[right])) {
				right--;
			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		return new String(ch);
	}
}
