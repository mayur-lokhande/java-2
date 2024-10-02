package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamApiExampleTwo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9, 2, 6, 3, 7, 4, 5, 7, 1, 8, 2, 6, 7, 8, 1);

		// sort the array and print in ascending order
		Set<Integer> sorted = new TreeSet<Integer>(numbers);
		System.out.println(sorted);

		// filter even numbers from list
		List<Integer> result1 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(result1);

		// filter odd numbers from list
		List<Integer> result2 = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(result2);

		// find maximum number from list
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println(max);

		// Calculate the sum of elements in a list of integers.
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		// OR
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
		long count = numbers.stream().filter(n -> n > 5).count();
		System.out.println(count);

		// Display the distinct elements from list
		List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);

		// return any element from list
		Optional<Integer> any = numbers.stream().findAny();
		System.out.println(any);

		// allMatch - check if all numbers in a list are positive
		boolean check = numbers.stream().allMatch(n -> n > 0);
		System.out.println(check);

		// Check if there are no negative numbers in a list.
		boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
		System.out.println(noneNegative);

		// return first element from list
		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println(first);

		// flatMap Example
		List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(2, 4), Arrays.asList(1, 3, 5, 6));
		List<Integer> flatList = nestedNumbers.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.print(flatList);

		// Peek Elements - It prints each element before passing it along the stream.
		numbers.stream().peek(System.out::println).collect(Collectors.toList());

		// Limit the output to the first 4 elements of the list.
		List<Integer> limitDemo = numbers.stream().limit(4).collect(Collectors.toList());
		System.out.println(limitDemo);

		// Skip the first 7 elements of a list and return the rest.
		List<Integer> skipDemo = numbers.stream().skip(7).collect(Collectors.toList());
		System.out.println(skipDemo);

		// Convert a list of integers to a set to remove duplicates.
		Set<Integer> uniqueElements = numbers.stream().collect(Collectors.toSet());
		System.out.println(uniqueElements);

		//summaryStatistics provides a summary (max, min, average, sum, count) for a stream of integers.
		IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println(stats);
	}
}
