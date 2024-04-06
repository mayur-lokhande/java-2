package arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int arr0[] = new int[5];
		arr0[0] = 9;
		arr0[1] = 10;
		arr0[2] = 11;
		arr0[3] = 12;
		arr0[4] = 13;
		for (int i : arr0) {
			System.out.println(i);
		}

		int[] arr = new int[3];
		arr[0] = 101;
		arr[1] = 102;
		arr[2] = 103;
		for (int i : arr) {
			System.out.println(i);
		}

		String[] arr1 = new String[5];
		arr1[0] = "Mayur";
		arr1[1] = "Arambh";
		arr1[2] = "Samarth";
		arr1[3] = "Sagar";
		arr1[4] = "Anuj";
		for (String i : arr1) {
			System.out.println(i);
		}
		double arr2[] = { 1, 2, 3, 5, 6, 7, 8 };
		for (double d : arr2) {
			System.out.println(d);
		}

		long arr3[] = new long[] { 1, 2, 3, 5, 6, 7, 8 };
		for (long l : arr3) {
			System.out.println(l);
		}
	}

}
