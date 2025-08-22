package recursionPrograms;

public class StringReverse {

	public static void main(String[] args) {

		String str = "RecursiveCall";
		System.out.println(stringReverse(str));
	}

	public static String stringReverse(String str) {
		
		if (str.length() - 1 == 0) {
			return str.substring(0);
		}

		return str.charAt(str.length() - 1) + stringReverse(str.substring(0, str.length() - 1));

	}

}
