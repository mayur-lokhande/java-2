package oop;

interface InterfaceOne {

}

interface ComputeOne {
	void add();

	void sub();
}

interface ComputeTwo {
	void mul();

	void div();
}

interface AdvanceCompute extends ComputeOne, ComputeTwo {
	void square();

	void cube();
}

class Compute implements AdvanceCompute {

	@Override
	public void square() {
		int x, y;
		x = 5;
		y = x * x;
		System.out.println(y);
	}

	@Override
	public void cube() {
		int x, y;
		x = 5;
		y = x * x * x;
		System.out.println(y);
	}

	@Override
	public void add() {
		int a, b, c;
		a = 10;
		b = 5;
		c = a + b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		int a, b, c;
		a = 10;
		b = 5;
		c = a - b;
		System.out.println(c);
	}

	@Override
	public void mul() {
		int a, b, c;
		a = 10;
		b = 5;
		c = a * b;
		System.out.println(c);
	}

	@Override
	public void div() {
		int a, b, c;
		a = 10;
		b = 5;
		c = a / b;
		System.out.println(c);
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Compute c = new Compute();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.square();
		c.cube();
	}
}
