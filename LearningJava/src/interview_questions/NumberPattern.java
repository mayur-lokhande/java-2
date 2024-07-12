package interview_questions;

public class NumberPattern {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {//Outer loops for rows
			//Print leading spaces to center to pattern
			for(int s=n;s>i;s--) {
				System.out.print(" ");
			}
			//print numbers in descending order
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//print numbers in increasing order
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();//Move to the next line after each row
		}
	}
}
