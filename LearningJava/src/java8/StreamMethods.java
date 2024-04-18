package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMethods {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 8, 4, 1, 9, 11, 4, 2);

		// findFirst
		Optional<Integer> findFirst = list.stream().findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		} else {
			System.out.println("Stream is empty.");
		}

		// findAny
		Optional<Integer> findAny = list.stream().findAny();
		if (findAny.isPresent()) {
			System.out.println(findAny.get());
		} else {
			System.out.println("Stream is empty.");
		}

		// count
		System.out.println("total elements in list:" + list.stream().count());

		// min
		System.out
				.println("Minimum value in list is:" + list.stream().min(Comparator.comparing(Integer::valueOf)).get());

		// max
		System.out
				.println("Maximum value in list is:" + list.stream().max(Comparator.comparing(Integer::valueOf)).get());
	}

}