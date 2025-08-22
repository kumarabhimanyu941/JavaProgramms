package practice1;

public class secondSmallestNumberWithoutStreams {

	public static void main(String[] args) {

		int[] array = { 23, 56, 76, -90, 77 };
		System.out.println(secondSmallest(array));
	}

	public static int secondSmallest(int array[]) {

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
