package recursionPrograms;

public class findFactorial {

	public static void main(String[] args) {

		int num = 5;

		System.out.println(findFactorial(num));
		;
		// 5*4*3*2*1
		// 5*4!
	}

	public static int findFactorial(int num) {

		if (num == 1) {
			return 1;
		}

		return num * findFactorial(num - 1);

	}

}
