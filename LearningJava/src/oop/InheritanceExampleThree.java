package oop;

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}

	void sleep() {
		System.out.println("Animal is sleeping");
	}

	void breathe() {
		System.out.println("Animal is breathing");
	}
}

class Tiger extends Animal {
	void eat() {
		System.out.println("Tiger is eating");
	}

	void sleep() {
		System.out.println("Tiger is sleeping");
	}

	void breathe() {
		System.out.println("Tiger is breathing");
	}
}

class Deer extends Animal {
	void eat() {
		System.out.println("Deer is eating");
	}

	void sleep() {
		System.out.println("Deer is sleeping");
	}

	void breathe() {
		System.out.println("Deer is breathing");
	}
}

class Monkey extends Animal {
	void eat() {
		System.out.println("Monkey is eating");
	}

	void sleep() {
		System.out.println("Monkey is sleeping");
	}

	void breathe() {
		System.out.println("Monkey is breathing");
	}
}
//Creating parent reference to child
class Forest{
	void allowAnimal(Animal ref){
		ref.eat();
		ref.sleep();
		ref.breathe();
	}
}

public class InheritanceExampleThree {
	public static void main(String[] args) {
		Tiger t=new Tiger();
		Deer d =new Deer();
		Monkey m=new Monkey();
		
		Forest f=new Forest();
		f.allowAnimal(t);
		f.allowAnimal(d);
		f.allowAnimal(m);
	}
}
