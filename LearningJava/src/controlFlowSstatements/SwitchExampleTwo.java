package controlFlowSstatements;

import java.util.Scanner;

public class SwitchExampleTwo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("1: Addition");
		System.out.println("2: Substraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("Enter your choice..!");
		
		int ch;
		Scanner scan=new Scanner(System.in);
		ch=scan.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter Numbers to add:");
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println("Addition is:"+ (a+b));
			break;
		case 2:
			System.out.println("Enter Numbers to sustract:");
			int p=scan.nextInt();
			int q=scan.nextInt();
			System.out.println("Substraction is:"+ (p-q));
			break;
		case 3:
			System.out.println("Enter Numbers to multiply:");
			int i=scan.nextInt();
			int j=scan.nextInt();
			System.out.println("Multiplication is:"+ (i*j));
			break;
		case 4:
			System.out.println("Enter Numbers to division:");
			int x=scan.nextInt();
			int y=scan.nextInt();
			System.out.println("Division is:"+ (x/y));
			break;
		default:
			System.out.println("Please enter correct choice");
		}

	}

}
