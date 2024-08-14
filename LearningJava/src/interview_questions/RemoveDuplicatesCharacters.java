package interview_questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCharacters {
    public static void main(String[] args) {
        String input = "programming";

        // Remove duplicates
        String result = removeDuplicates(input);

        // Print the result
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        // Create a LinkedHashSet to store characters
        Set<Character> charSet = new LinkedHashSet<>();

        // Append each character to the set
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }

        // Construct a new string from the characters in the set
//        StringBuilder sb = new StringBuilder();
//        for (char c : charSet) {
//            sb.append(c);
//        }
//
//        return sb.toString();
        
     // Construct a new string from the characters in the set (efficiency matters)
        String result = "";
        for (char c : charSet) {
            result += c;
        }

        return result;
    }
}
