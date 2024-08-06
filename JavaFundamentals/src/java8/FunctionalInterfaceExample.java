package java8;

@FunctionalInterface
interface interfaceOne {
	String show(String msg);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		 // Implement the interface using a lambda expression
        interfaceOne instance = (msg) ->msg;

        // Call the method on the lambda instance
        String result = instance.show("Hello, world!");
        System.out.println(result);
	}

}
