package impConcepts;

import impConcepts.Outer.Inner;

class Outer {
	int num = 10;

	void dispaly() {
		System.out.println("Inside display method of Outer class");
	}

	class Inner {
		void display() {
			System.out.println("Inside display method of Inner class");
		}
	}
}

public class InnerClassExample {

	public static void main(String[] args) {
		Outer obj1 = new Outer();
		obj1.dispaly();
		System.out.println(obj1.num);

		// calling inner class method
		Inner obj2 = obj1.new Inner();
		obj2.display();
	}

}
