package interview_questions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// Swap two numbers without using third variable
		SwapTwoNumbers s=new SwapTwoNumbers();
		s.swapNumbers(12, 34);
	}

	public void swapNumbers(int a, int b) {
		System.out.println("Before Swap: a="+a+", b="+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap: a="+a+", b="+b);
	}

}
