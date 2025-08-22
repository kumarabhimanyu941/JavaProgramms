package firstPractice;

public class secondLargestElementInArray {

	public static void main(String[] args) {

		int array[] = { 1, 2, 67, 34, 98, 98 };

		System.out.println(secondLargestElementInArray(array));

	}

	public static int secondLargestElementInArray(int[] array) {

		int max1 = 0;
		int max2 = 0;

		if (array[0] > array[1]) {
			max1 = array[0];
			max2 = array[1];
		} else {
			max1 = array[1];
			max2 = array[0];
		}

		for (int i = 2; i < array.length; i++) {

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
