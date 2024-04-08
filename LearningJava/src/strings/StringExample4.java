package strings;

public class StringExample4 {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Rama";
		String s3 = "Rama";

		if (s1 == s2 && s1 == s3) {
			System.out.println("All are pointing to same object");
		} else {
			System.out.println("All are not pointing to same object.");
		}
	}
}
