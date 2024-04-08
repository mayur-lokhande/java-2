package strings;

public class StringExample6 {

	public static void main(String[] args) {

		String s1, s2;
		s1 = "Rama" + "Sita";
		System.out.println(s1);
		s2 = "Rama" + "Sita";
		System.out.println(s2);
		if (s1 == s2) {
			System.out.println("s1 & s2 are pointing to same object(constant pool).");
		} else {
			System.out.println("s1 & s2 are pointing to different object(non-constant pool).");
		}

		String s3 = "Rama";
		String s4 = "Sita";
		String s5, s6;
		s5 = s3 + s4;
		System.out.println(s5);
		s6 = s3 + s4;
		System.out.println(s6);
		if (s5 == s6) {
			System.out.println("s1 & s2 are pointing to same object(constant pool).");
		} else {
			System.out.println("s1 & s2 are pointing to different object(non-constant pool).");
		}
	}
}
