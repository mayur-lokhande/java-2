package java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuiltFunctionalInterfacesExample {

	public static void main(String[] args) {
		// Function that converts a String to its length
		//Description- Represents a function that accepts one argument and produces a result.
		Function<String, Integer> stringLengthFunction = s -> s.length();
		String input = "Mayur Lokhande";
		Integer length = stringLengthFunction.apply(input);
		System.out.println("Length of '" + input + "' is: " + length);

		// BiFunction that adds two integers
		//Description- Represents a function that accepts two arguments and produces a result.
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		Integer result = add.apply(5, 10);
		System.out.println("Sum: " + result);

		// Predicate that checks if a number is greater than 10
		//Description- Represents a predicate (boolean-valued function) of one argument.
		Predicate<Integer> isGreaterThanTen = n -> n > 10;
		Integer number = 15;
		boolean result1 = isGreaterThanTen.test(number);
		System.out.println(number + " is greater than 10: " + result1);

		// Supplier that returns a random number
		//Description- Represents a supplier of results.
		Supplier<Double> randomSupplier = () -> Math.random();
		Double randomValue = randomSupplier.get();
		System.out.println("Random value: " + randomValue);

		// Consumer that prints a string in uppercase
		//Description- Represents an operation that accepts a single input argument and returns no result.
		Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
		String ip = "hello";
		printUpperCase.accept(ip);

	}

}
