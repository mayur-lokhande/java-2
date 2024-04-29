package oop;

class Plane {
	void takeoff() {
		System.out.println("Plane took off");
	}

	void fly() {
		System.out.println("Plane is flying");
	}

	void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane {
	void carryCargo() {
		System.out.println("Carrying cargo...");
	}
}

class PassengerPlane extends Plane {
	void carryPassenger() {
		System.out.println("Carrying passesngers...");
	}
}

class FighterPlane extends Plane {
	void carryWeapon() {
		System.out.println("Carrying weapons...");
	}
}

public class InheritanceExampleOne {

	public static void main(String[] args) {
		CargoPlane cargoPlane = new CargoPlane();
		PassengerPlane passengerPlane = new PassengerPlane();
		FighterPlane fighterPlane = new FighterPlane();

		cargoPlane.takeoff();
		cargoPlane.fly();
		cargoPlane.carryCargo();
		cargoPlane.land();

		passengerPlane.takeoff();
		passengerPlane.fly();
		passengerPlane.carryPassenger();
		passengerPlane.land();

		fighterPlane.takeoff();
		fighterPlane.fly();
		fighterPlane.carryWeapon();
		fighterPlane.land();
	}

}
