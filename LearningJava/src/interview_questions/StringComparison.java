package interview_questions;

public class StringComparison {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";

		boolean identical = areIdentical(str1, str2);

		if (identical) {
			System.out.println("The strings are identical.");
		} else {
			System.out.println("The strings are not identical.");
		}
	}

	public static boolean areIdentical(String str1, String str2) {
		// If the lengths are different, the strings cannot be identical
		if (str1.length() != str2.length()) {
			return false;
		}

		// Compare characters at each position
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}

		// If all characters match, the strings are identical
		return true;
	}
}
