package newPractice;

public class secondSmallestElementInArray {

	public static void main(String[] args) {
		int[] array = { 45, -90, -25, 67, 895, 432, 0 };
		System.out.println(secondSmallestElement(array));
	}

	public static int secondSmallestElement(int[] array) {

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min1) {
				min2 = min1;
				min1 = array[i];
			} else if (array[i] < min2 && array[i] != min1) {
				min2 = array[i];
			}
		}
		return min2;
	}

}
