package java8;

//lambda expression with one parameter
interface Printable {
	void print(String name);
}

public class LambdaExpressionWithOneParameter {

	public static void main(String[] args) {
		Printable p = (name) -> System.out.println("Hello " + name);
		p.print("Mayur");
	}

}