package java8;

import java.util.function.Consumer;
import java.util.function.Function;

//interface which contains only one abstract method and any number of default & static method is referred to as functional interface
@FunctionalInterface
interface FunctionalInterfaceDemo {
	void print();

	default void default1() {
		System.out.println("default method1");
	}

	default void default2() {
		System.out.println("default method2");
	}

	static void static1() {
		System.out.println("static method1");
	}

	static void static2() {
		System.out.println("static method2");
	}
}

class MyClass implements FunctionalInterfaceDemo {

	@Override
	public void print() {
		System.out.println("print() method called.");
	}

}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		FunctionalInterfaceDemo fid = new MyClass();
		fid.print();
		fid.default1();
		FunctionalInterfaceDemo.static1();
		fid.default2();
		FunctionalInterfaceDemo.static2();

		// Inbuilt Function Interface by using lambda
		Function<String, Integer> f = (s) -> s.length();
		System.out.println(f.apply("Mayur"));

		// Inbuilt Consumer Interface by using lambda
		Consumer<String> c = (s) -> System.out.println(s);
		c.accept("Hello World!");
	}
}