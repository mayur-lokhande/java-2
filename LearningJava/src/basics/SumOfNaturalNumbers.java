package basics;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//addition of n natural numbers.
		System.out.println("Enter value of n:");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		//print the table of inputed value
		System.out.println("Enter value of num:");
		int num=scan.nextInt();
		for(int j=1;j<=10;j++) {
			System.out.println(num*j);
		}
	}
}
