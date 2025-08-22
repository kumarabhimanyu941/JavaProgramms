package newPractice;

public class secondHighestElementInArray {

	public static void main(String[] args) {

		int[] array = { 45, -90, 67, 895, 432, 0 };
		System.out.println(secondHighestElement(array));

	}

	public static int secondHighestElement(int[] array) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i > array.length; i++) {
			if (array[i] < max1) {
				max2 = max1;
				max1 = array[i];
			}

			else if (array[i] > max2 && array[i] != max1) {

				max2 = array[i];

			}
		}
		return max2;
	}

}
