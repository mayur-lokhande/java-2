package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

//stream example
public class CreateStreamObjects {

	public static void main(String[] args) {
		System.out.println("-------create a stream-------");
		Stream<String> stream = Stream.of("A", "B", "C");
		stream.forEach(System.out::println);

		System.out.println("-------create a stream from source-------");
		Collection<String> collection = Arrays.asList("Mayur", "Shubham", "Omkar", "Rohit");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);

		System.out.println("-------create a stream using List-------");
		List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);

		System.out.println("-------create a stream using Set-------");
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);

		System.out.println("-------create a stream using arra-------");
		String[] array = { "a", "b", "c" };
		Stream<String> stream5 = Arrays.stream(array);
		stream5.forEach(System.out::println);
	}

}