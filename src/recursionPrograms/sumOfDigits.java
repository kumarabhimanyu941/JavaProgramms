package recursionPrograms;

public class sumOfDigits {

	public static void main(String[] args) {

		System.out.println(sumOfDigits(1234));
	}

	// 4+3+2+1
	public static int sumOfDigits(int num) {
		if (num == 0) {
			return 0;
		}

		return num % 10 + sumOfDigits(num / 10);

	}

}
