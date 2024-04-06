package controlFlowSstatements;

public class ForEachExample {

	public static void main(String[] args) {
		int array[] = new int[5];
		array[0] = 1;
		array[1] = 11;
		array[2] = 111;
		array[3] = 1111;
		array[4] = 11111;

		for (int i : array) {
			System.out.println(i);
		}
	}
}
