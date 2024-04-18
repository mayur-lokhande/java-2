package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mayur", "Papnna", "Rahul", "Omkar", "Arambh", "Rohit", "Shubham",
				"Dhananjay", "Kartik");
		// Ascending Order
		// normal way of sorted method
		List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// By using comparator
		List<String> sortedList2 = names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedList2);

		// by using lambda expression
		List<String> sortedList3 = names.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println(sortedList3);

		// Descending Order
		List<String> sortedList4 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList4);

		List<String> sortedList5 = names.stream().sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());
		System.out.println(sortedList5);

	}

}