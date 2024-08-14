package interview_questions;

public class VowelCounter {

	public static void main(String[] args) {
		// Define the input string
		String input = "This is an example string to count vowels.";

		// Convert the input string to lowercase to make the counting case-insensitive
		input = input.toLowerCase();

		// Initialize counters for each vowel
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;

		// Loop through each character in the input string
		for (char ch : input.toCharArray()) {
			// Increment the respective vowel counter based on the character
			switch (ch) {
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			default:
				// Do nothing for non-vowel characters
				break;
			}
		}

		// Print the results
		System.out.println("Number of occurrences of each vowel:");
		System.out.println("a: " + aCount);
		System.out.println("e: " + eCount);
		System.out.println("i: " + iCount);
		System.out.println("o: " + oCount);
		System.out.println("u: " + uCount);
	}
}
