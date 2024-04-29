package oop;

abstract class Bird {
	abstract void fly();

	abstract void eat();
}

class Sparrow extends Bird {

	@Override
	void fly() {
		System.out.println("Sparrow fly very fast");
	}

	@Override
	void eat() {
		System.out.println("Sparrow eats insect");
	}
}

class Crow extends Bird {

	@Override
	void fly() {
		System.out.println("Crow fly at medium height");
	}

	@Override
	void eat() {
		System.out.println("Crow eats fish");
	}

}

abstract class Eagle extends Bird {
	void fly() {
		System.out.println("All eagle fly at very high");
	}

	abstract void eat();
}

class SerpentEagle extends Eagle {

	@Override
	void eat() {
		System.out.println("Serpent Eagle eats snakes");
	}
}

class GoldenEagle extends Eagle {

	@Override
	void eat() {
		System.out.println("Golden eagle hunts over the ocean");
	}

}

class Sky {
	void allowBird(Bird ref) {
		ref.fly();
		ref.eat();
	}
}

public class AbstractClassExampleTwo {

	public static void main(String[] args) {
		Sparrow s = new Sparrow();
		Crow c = new Crow();
		SerpentEagle sp = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();

		Sky sky = new Sky();
		sky.allowBird(s);
		sky.allowBird(c);
		sky.allowBird(sp);
		sky.allowBird(ge);
	}

}
