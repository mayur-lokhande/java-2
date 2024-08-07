package interview_preparation;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Java Programming";
		int l = str.length();
		System.out.println("Original String is: " + str);

		char original[] = new char[l];
		char reverse[] = new char[l];

		int i;
		for (i = 0; i < l; i++) {
			original[i] = str.charAt(i);
		}

		i = l - 1;
		int j = 0;
		while (i >= 0) {
			reverse[j] = original[i];
			i--;
			j++;
		}

		String result = new String(reverse);
		System.out.println("Reversed String is: " + result);

	}

}
