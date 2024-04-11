package arrays;

import java.util.Scanner;

public class Print2DArray {
	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		Scanner scan = new Scanner(System.in);
		int i,j;
		for(i=0;i<arr.length;i++) { //arr.length -> total rows
			for(j=0;j<arr[i].length;j++) { //arr[i].length -> columns in each row
				System.out.println("Enter an element:");
				arr[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
