package interview_preparation;

import java.util.Stack;

public class ValidateBrackets {

	public static void main(String[] args) {
		String str = "(}";
		boolean status = validateStringBracket(str);
		System.out.println(str);
		System.out.println(status);
	}

	private static boolean validateStringBracket(String s) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '}') {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == ')') {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == ']') {
				if (stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(ch);
			}
		}
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}
}
