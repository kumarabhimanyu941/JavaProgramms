package thirdPractice;

public class findSecondLargestNumber {

	public static void main(String[] args) {

		int array[] = { 1, 6, 7, 3, 56, 0, 9, 876, 54 };
		System.out.println(secondLargestNumber(array));
	}

	public static int secondLargestNumber(int array[]) {

		int max1 = 0;
		int max2 = 0;

		if (array[0] > array[1]) {
			max1 = array[0];
			max2 = array[1];
		} else {
			max1 = array[1];
			max2 = array[0];
		}

		for (int i =2; i < array.length; i++) {
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
