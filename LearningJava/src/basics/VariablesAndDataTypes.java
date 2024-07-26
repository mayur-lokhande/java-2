package basics;

import java.util.Scanner;

public class VariablesAndDataTypes {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = (a * b) / (a - b);
		System.out.println(result);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of x:");
		int x=scan.nextInt();
		System.out.println("Enter value of y:");
		int y=scan.nextInt();
		int sum=x+y;
		System.out.println(sum);
	}

}
