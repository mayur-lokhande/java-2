package strings;

public class StringExample5 {

	public static void main(String[] args) {
		String s1 = new String("Rama");
		String s2 = new String("Rama");
		if (s1 == s2) { // == compares the address
			System.out.println("Reference are pointing to same object.");
		} else {
			System.out.println("Reference are pointing to different object.");
		}
	}
}
