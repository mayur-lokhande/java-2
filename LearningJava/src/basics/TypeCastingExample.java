package basics;

public class TypeCastingExample {

	public static void main(String[] args) {
		// Implicit Type Casting
		byte b = 123;
		int i = b;
		System.out.println(i);

		// Explicit Type Casting
		float fl = 1993.45f;
		int num = (int) fl;
		System.out.println(num);// converted to integer but loss of data

		int a = 257;
		byte bt = (byte) a; // 257%256=1
		System.out.println(bt);

		// Type Promotion
		byte x = 20;
		byte y = 20;
		int result = x * y;
		System.out.println(result);

	}

}
