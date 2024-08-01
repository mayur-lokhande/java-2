package patterns;

public class PatternTwo {
	/*
	 * 1 1 1 1 1 
	 * 2 2 2 2 2 
	 * 3 3 3 3 3 
	 * 4 4 4 4 4 
	 * 5 5 5 5 5
	 */
	public static void main(String[] args) {
		int n=1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" "+n);
			}
			n++;
			System.out.println();
		}
	}

}
