package HW04;

import java.util.Arrays;

public class HW04_Problem_b {

	public static int findMinIndex(int[] array, int startIndex) {
		if (startIndex == array.length - 1) {
			return startIndex;
		}

		int minIndex = findMinIndex(array, startIndex + 1);

		if (array[startIndex] < array[minIndex]) {
			return startIndex;
		} else {
			return minIndex;
		}
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = findMinIndex(array, i);

			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] array = { 10, 7, 12, -5, 2, 13, 25, 18, 11, 22, -3 };
		
		System.out.println("Original array: " + Arrays.toString(array));

		selectionSort(array);
		
		System.out.println("Sorted array: " + Arrays.toString(array));
		System.out.println("The location of the minium value of the sorted array is at index 0, the value of the minimum number is " + array[0]);

	}
}