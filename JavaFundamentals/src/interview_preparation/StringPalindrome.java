package interview_preparation;

import java.util.Arrays;
import java.util.Scanner;
//check whether given string is Palindrome or not
public class StringPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		str=scan.next();
		int length=str.length();
		//System.out.println(length);
		char original[]=new char[length];
		char reverse[]=new char[length];
		
		int i,j;
		for(i=0;i<length;i++) {
			original[i]=str.charAt(i);
		}
		i=length-1;
		j=0;
		while(i>=0) {
			reverse[j]=original[i];
			i--;
			j++;
		}
		boolean status=Arrays.equals(original, reverse);
		if(status==true) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
