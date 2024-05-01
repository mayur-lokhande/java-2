package impConcepts;

class MyClass {
	void print() {
		System.out.println("Inside print method of MyClass");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		MyClass o = new MyClass() {
			void print() {

				System.out.println("Inside print method of Anonymous Inner Class");
			}
		};
		o.print();
	}
}
