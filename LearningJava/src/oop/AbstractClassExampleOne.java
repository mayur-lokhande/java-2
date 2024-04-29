package oop;

import java.util.Scanner;

abstract class Shape {
	double area;

	abstract void input();

	abstract void calculateArea();

	void display() {
		System.out.println("Area is:" + area);
	}
}

class Square extends Shape {
	double l;
	@Override
	void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenght of square:");
		l=scan.nextFloat();
	}

	@Override
	void calculateArea() {
		area=l*l;
	}

}

class Rectangle extends Shape {
	double l,b;
	
	@Override
	void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenght of rectangle:");
		l=scan.nextFloat();
		System.out.println("Enter breadth of rectangle:");
		b=scan.nextFloat();
	}

	@Override
	void calculateArea() {
		area=l*b;
	}

}

class Circle extends Shape {
	double r;
	
	@Override
	void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		r=scan.nextFloat();
	}

	@Override
	void calculateArea() {
		area=3.14*r*r;
	}

}

class Geometry{
	void allowShape(Shape ref) {
		ref.input();
		ref.calculateArea();
		ref.display();
	}
}

public class AbstractClassExampleOne {

	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.allowShape(s);
		g.allowShape(r);
		g.allowShape(c);
	}

}
