package java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceExampleOne {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Method Reference to static method

		// 1. Using user defined method
		// lambda expression
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceExampleOne.addition(a, b);
		System.out.println(biFunctionLambda.apply(12, 23));
		// method reference
		BiFunction<Integer, Integer, Integer> biFunction = MethodReferenceExampleOne::addition;
		System.out.println(biFunction.apply(50, 120));

		// 2. Using inbuilt Function Interface
		// lambda expression
		Function<Integer, Double> function = (num) -> Math.sqrt(num);
		System.out.println(function.apply(16));
		// method reference
		Function<Integer, Double> fun = Math::sqrt;
		System.out.println(fun.apply(81));
	}

}