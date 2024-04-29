package oop;

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {// different number of parameters
		return a + b + c;
	}

	public int add(double a, double b) {// different type of parameters
		return (int) (a + b);
	}

	public int add(double a, int b) {// different order of parameters
		return (int) (a + b);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int result1 = calculator.add(22, 56);
		System.out.println(result1);
		int result2 =calculator.add(12, 34, 56);
		System.out.println(result2);
		int result3 =calculator.add(23.1, 45.6);
		System.out.println(result3);
		int result4 =calculator.add(34.2, 76);
		System.out.println(result4);
	}
}
