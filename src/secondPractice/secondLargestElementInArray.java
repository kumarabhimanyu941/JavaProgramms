package secondPractice;

public class secondLargestElementInArray {

	public static void main(String[] args) {

		int[] array = { 0, -29 };
		System.out.println(secondLargestElementInArray(array));

	}

	public static int secondLargestElementInArray(int[] array) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max1) {
				max2 = max1;
				max1 = array[i];
			} else if (array[i] > max2 && array[i] != max1) {
				max2 = array[i];
			}
		}

		return max2;
	}

}
