package java8;

import java.util.function.Function;

public class MethodReferenceExampleThree {

	public static void main(String[] args) {
		// Reference to the instance method of an arbitrary object
		// using lambda expression
		Function<String, String> stringFunction = (String input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("MAYUR"));

		// using method reference
		Function<String, String> stringFun = String::toLowerCase;
		System.out.println(stringFun.apply("LOKHANDE"));

	}

}