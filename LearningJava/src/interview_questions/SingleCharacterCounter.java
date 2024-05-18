package interview_questions;

public class SingleCharacterCounter {
	public static void main(String[] args) {

		String str = "Today is beautiful day";

		// Initialize a counter for 'a'
		int count = 0;
		char arr[] = str.toCharArray();

		for (char c : arr) {
			if (c == 'a') {
				count++;
			}
		}
		// Print the occurrences of 'a'
		System.out.println("Occurrences of 'a' = " + count);
	}
}
