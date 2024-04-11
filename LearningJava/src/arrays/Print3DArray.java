package arrays;

import java.util.Scanner;

public class Print3DArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Ask the user for dimensions of the 3D array
		System.out.print("Enter the dimensions of the 3D array (separated by space): ");
		int d1 = scanner.nextInt();
		int d2 = scanner.nextInt();
		int d3 = scanner.nextInt();

		// Initialize a 3D array
		int[][][] threeDArray = new int[d1][d2][d3];

		// Populate the 3D array with user input
		System.out.println("Enter elements of the 3D array:");
		for (int i = 0; i < d1; i++) {
			for (int j = 0; j < d2; j++) {
				for (int k = 0; k < d3; k++) {
					System.out.print("Enter element [" + i + "][" + j + "][" + k + "]: ");
					threeDArray[i][j][k] = scanner.nextInt();
				}
			}
		}

		// Print the 3D array using indices i, j, and k
		System.out.println("The 3D array is:");
		for (int i = 0; i < d1; i++) {
			for (int j = 0; j < d2; j++) {
				for (int k = 0; k < d3; k++) {
					System.out.print(threeDArray[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		scanner.close();
	}

}
