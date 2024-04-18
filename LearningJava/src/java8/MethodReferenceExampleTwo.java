package java8;

@FunctionalInterface
interface Printable2 {
	void print(String msg);
}

public class MethodReferenceExampleTwo {

	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// Method reference to an instance method of an object.
		MethodReferenceExampleTwo m = new MethodReferenceExampleTwo();
		// lambda expression
		Printable2 p = (msg) -> m.display(msg);
		p.print("maYur");
		// Method reference
		Printable2 pp = m::display;
		pp.print("LokhandE");

	}

}