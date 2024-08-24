package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamApiExampleTwo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 9, 2, 6, 3, 7, 4, 5, 7, 1, 8);

		// sort the array and print in ascending order
		Set<Integer> sorted = new TreeSet<Integer>(numbers);
		System.out.println(sorted);

		// filter even numbers
		List<Integer> result1 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(result1);

		// filter odd numbers
		List<Integer> result2 = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(result2);

		// find maximum
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println(max);

		// Calculate the sum of elements in a list of integers.
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		//OR
		// Reduce a list of integers to their sum
		int total = numbers.stream().reduce(0, Integer::sum);
		System.out.println(total);
		
		// Sort a list of integers in ascending order.
		List<Integer> sortedNumbers = numbers.stream().distinct() // remove duplicates
				.sorted() // sort the numbers in ascending order
				.collect(Collectors.toList()); // collect into a list
		System.out.println(sortedNumbers);

		// Sort a list of integers in descending order.
		List<Integer> sortedNumbers1 = numbers.stream().distinct() // remove duplicates
				.sorted(Comparator.reverseOrder()) // sort the numbers in descending order
				.collect(Collectors.toList()); // collect into a list
		System.out.println(sortedNumbers1);

		// Count the number of elements in a list that are greater than 5
		List<Integer> list = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());
		System.out.println(list);

	}

}
