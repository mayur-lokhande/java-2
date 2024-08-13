package oop;

abstract class Plane {
	abstract void takeOff();

	abstract void fly();

	abstract void land();
}

class Cargo extends Plane {

	@Override
	void takeOff() {
		System.out.println("Cargo plane took off.");
	}

	@Override
	void fly() {
		System.out.println("Cargo plane is flying.");
	}

	@Override
	void land() {
		System.out.println("Cargo plane is landing.");
	}
}

class Passenger extends Plane {

	@Override
	void takeOff() {
		System.out.println("Passenger plane took off.");
	}

	@Override
	void fly() {
		System.out.println("Passenger plane is flying.");
	}

	@Override
	void land() {
		System.out.println("Passenger plane is landing.");
	}
}

class Fighter extends Plane {

	@Override
	void takeOff() {
		System.out.println("Fighter plane took off.");
	}

	@Override
	void fly() {
		System.out.println("Fighter plane is flying.");
	}

	@Override
	void land() {
		System.out.println("Fighter plane is landing.");
	}
}

class Airport {
	void allowPlane(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Cargo c = new Cargo();
		Passenger p = new Passenger();
		Fighter f = new Fighter();
		Airport a = new Airport();
		a.allowPlane(c);
		a.allowPlane(p);
		a.allowPlane(f);
	}
}
