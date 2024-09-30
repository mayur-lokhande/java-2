package interview_preparation;

import java.util.HashMap;
import java.util.Map;

public class ConsonantCounter {

	public static void main(String[] args) {
		// Define the input string
		String input = "Example string with several consonants";

		// Count occurrences of each consonant
		Map<Character, Integer> consonantCounts = countConsonants(input);

		// Print the results
		for (Map.Entry<Character, Integer> entry : consonantCounts.entrySet()) {
			System.out.println("Consonant '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
		}
	}

	// Method to count consonants in the input string
	public static Map<Character, Integer> countConsonants(String str) {
		// Create a map to store consonant counts
		Map<Character, Integer> counts = new HashMap<>();

		// Convert string to lower case to handle case insensitivity
		str = str.toLowerCase();

		// Iterate through each character in the string
		for (char ch : str.toCharArray()) {
			// Check if the character is a consonant
			if (isConsonant(ch)) {
				// Update the count in the map
				counts.put(ch, counts.getOrDefault(ch, 0) + 1);
			}
		}

		return counts;
	}

	// Method to check if a character is a consonant
	public static boolean isConsonant(char ch) {
		return Character.isLetter(ch) && !isVowel(ch);
	}

	// Method to check if a character is a vowel
	public static boolean isVowel(char ch) {
		// Define vowels
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char vowel : vowels) {
			if (ch == vowel) {
				return true;
			}
		}
		return false;
	}
}
