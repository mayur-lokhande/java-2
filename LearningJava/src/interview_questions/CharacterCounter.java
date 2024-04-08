package interview_questions;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

	public static void main(String[] args) {
		String inputString = "Today is beautiful day";
		Map<Character, Integer> charCounts = new HashMap<>();

		// Count occurrences of each character
		for (char ch : inputString.toCharArray()) {
			// If the character is already counted, increase its count
			// Otherwise, start counting it
			if (ch != ' ' && ch != ',') {
				charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
			}
		}

		// Print the results
		for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
			System.out.println("Occurrences of '" + entry.getKey() + "' : " + entry.getValue());
		}

//		String str = "I am from India";
//
//		// declare a HashMap
//		HashMap<Character, Integer> count = new HashMap<>();
//		char arr[] = str.toCharArray();
//
//		for (char c : arr) {
//			if (c != ' ') {
//				if (count.containsKey(c)) {
//					count.put(c, count.get(c) + 1);
//				} else {
//					count.put(c, 1);
//				}
//			}
//		}
//		for (Map.Entry<Character,Integer> entry : count.entrySet()) {
//			System.out.println("Occurrences of " + entry.getKey() + " = " + entry.getValue());
//		}
	}

}
