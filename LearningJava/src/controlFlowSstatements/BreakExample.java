package controlFlowSstatements;

public class BreakExample {

	public static void main(String[] args) {
		int n = 10;

		while (n < 20) {
			if (n == 13) {
				break;
			}
			System.out.println(n);
			n++;
		}
	}
}
