package interview_questions;

import java.util.Arrays;

public class FifthLargestElement {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int fifthLargest = findFifthLargest(array);
		System.out.println("The 5th largest element in the array is: " + fifthLargest);
		/* //In single line
		Arrays.sort(array);
		System.out.println(array[array.length-5]);
		*/
	}

	public static int findFifthLargest(int[] array) {
		if (array.length < 5) {
			System.out.println("Array doesn't have enough elements.");
			return -1; // Indicating failure
		}
		Arrays.sort(array); // Sort the array in ascending order

		return array[array.length - 5]; // Return the 5th largest element
	}

}
