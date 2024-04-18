package java8;

//Lambda expression is anonymous function which is used provide implementation for functional interfaces.
//functional interface is a interface which has only one abstract method.
//lambda expression is used to provide the implementation for functional interface by functional style.
interface Shape {
	void draw();
}
//without using lambda expression we need to write these codes for functional interface and create object in main method to print.
/*
 * class Rectangle implements Shape {
 * 
 * @Override public void draw() {
 * System.out.println("Rectangle class draw() method."); }
 * 
 * }
 * 
 * class Square implements Shape {
 * 
 * @Override public void draw() {
 * System.out.println("Square class draw() method."); }
 * 
 * }
 * 
 * class Circle implements Shape {
 * 
 * @Override public void draw() {
 * System.out.println("Reactangle class draw() method."); } }
 */

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		Shape rectangle = () -> System.out.println("This is Rectangle");
		rectangle.draw();

		Shape square = () -> System.out.println("This is Square");
		square.draw();

		Shape circle = () -> System.out.println("This is Circle");
		circle.draw();

	}

}