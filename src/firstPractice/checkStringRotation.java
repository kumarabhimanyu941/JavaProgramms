package firstPractice;

public class checkStringRotation {

	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "dabc";
		System.out.println(stringRotationTest(str1, str2));
	}

	public static boolean stringRotationTest(String str1, String str2) {

		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}
		String doubled = str1 + str1;
		return doubled.contains(str2);
	}
}
