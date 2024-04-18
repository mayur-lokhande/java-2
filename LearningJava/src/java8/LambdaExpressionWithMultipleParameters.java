package java8;

interface Compute {
	void add(int a, int b, int c);
}

public class LambdaExpressionWithMultipleParameters {

	public static void main(String[] args) {
		Compute addition = (a, b, c) -> System.out.println(a + b + c);
		addition.add(123, 456, 789);
	}

}