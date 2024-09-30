package interview_preparation;

public class ReverseWords {
	public static void main(String[] args) {
		// Example input string
		String input = "I live in India";

		// Call the method to reverse each word
		String result = reverseWords(input);

		// Print the result
		System.out.println(result);
	}

	public static String reverseWords(String input) {
		// Split the input string into words using space as delimiter
		String[] words = input.split(" ");

		// StringBuilder to build the final result
		StringBuilder reversedString = new StringBuilder();

		// Process each word
		for (String word : words) {
			// Reverse the current word and append it to the result
			reversedString.append(reverseWord(word)).append(" ");
		}

		// Convert StringBuilder to String and trim the final result to remove any extra
		// space
		return reversedString.toString().trim();
	}

	public static String reverseWord(String word) {
		// Create a StringBuilder from the word and reverse it
		StringBuilder reversed = new StringBuilder(word);
		return reversed.reverse().toString();
	}
}
