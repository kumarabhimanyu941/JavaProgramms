package newPractice;

public class removeSpecialCharsAndWhiteSpacesInString {

	public static void main(String[] args) {
		String str = "Epam123Int%^er(*view@#$";

		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
