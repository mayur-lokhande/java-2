package interview_preparation;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		String input = "programming";

		// Create a HashMap to store the character count
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Convert the string to a char array
		char[] charArray = input.toCharArray();

		// Count the occurrences of each character
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		// Print the characters that have a count greater than 1
		System.out.println("Duplicate characters in the string \"" + input + "\" are:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}
