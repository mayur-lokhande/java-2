package strings;

public class StringExample3 {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		if (s1 == s2) { // == compares the address
			System.out.println("Reference are pointing to same object.");
		} else {
			System.out.println("Reference are pointing to different object.");
		}
	}
}
