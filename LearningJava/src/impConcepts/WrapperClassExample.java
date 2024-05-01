package impConcepts;

public class WrapperClassExample {

	public static void main(String[] args) {
		int num = 108;
		Integer number = num;// Autoboxing - converting primitive data type to Object type
		System.out.println(number);

		int d = number;// Unboxing - converting Object type to Primitive data type
		System.out.println(d);
	}

}
