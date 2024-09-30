package java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuiltFunctionalInterfacesExample {

	public static void main(String[] args) {
		// Function - Represents a function that accepts one argument and produces a result.
		// Function that converts a String to its length
		Function<String, Integer> stringLengthFunction = s -> s.length();
		String input = "Java Language";
		Integer length = stringLengthFunction.apply(input);
		System.out.println("Length of '" + input + "' is: " + length);

		// BiFunction that adds two integers
		//Description- Represents a function that accepts two arguments and produces a result.
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		Integer result = add.apply(5, 10);
		System.out.println("Sum: " + result);

		// Predicate - Represents a predicate (boolean-valued function) of one argument.
		// Predicate checks the condition and returns boolean output, true or false
		Predicate<Integer> isGreaterThanTen = n -> n > 10;
		Integer number = 15;
		//predicate has a function i.e test(), & it returns true OR false
		boolean result1 = isGreaterThanTen.test(number); //here 15>10 = true
		System.out.println(number + " is greater than 10: " + result1);

		// Supplier - Represents a supplier of results.
		// Supplier does not take input and it returns output
		Supplier<Double> randomSupplier = () -> Math.random();
		Double randomValue = randomSupplier.get();
		System.out.println("Random value: " + randomValue);

		// Consumer - Represents an operation that accepts a single input argument and returns no result.
		// Consumer only consumes data(no output), used to modify data
		Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
		String ip = "hello";
		printUpperCase.accept(ip);

	}

}
