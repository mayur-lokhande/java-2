package interview_questions;

import java.util.Arrays;

public class ReverseStringArray {

	public static void main(String[] args) {
		String str[] = { "Mayur", "Aniket", "Rohit", "Omkar" };
		int l = str.length;
		String rev[] = new String[l];
		for (int i = l - 1; i >= 0; i--) {
			rev[l - 1 - i] = str[i];
		}
		System.out.println(Arrays.toString(rev));
	}
}