package controlFlowSstatements;

public class ContinueExample {

	public static void main(String[] args) {
		byte b = 100;

		for (int i = 0; i < b; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
