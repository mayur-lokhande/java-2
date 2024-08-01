package patterns;

public class PatternOne {
	/*
	 * 1 1 1 1 1 
	 * 1 1 1 1 1 
	 * 1 1 1 1 1 
	 * 1 1 1 1 1
	 */
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" "+n);
			}
			System.out.println();
		}
	}

}
