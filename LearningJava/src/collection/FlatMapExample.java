package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		String[][] arrayOfStringArrays = { { "Hello", "World" }, { "Java", "Programming" }, { "is", "fun" } };

		// Using flatMap to flatten the array of arrays into a single list
		List<String> words = Arrays.stream(arrayOfStringArrays).flatMap(Arrays::stream).collect(Collectors.toList());
		// Printing the list of words
		System.out.println(words);

		int[][] arrayOfIntegerArrays = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		// Using flatMapToInt to flatten the array of arrays into a single array of
		// integers
		int[] flattenedArray = Arrays.stream(arrayOfIntegerArrays).flatMapToInt(Arrays::stream).toArray();
		// Printing the flattened array
		System.out.println(Arrays.toString(flattenedArray));
	}

}
