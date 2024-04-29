package oop;

class Aeroplane {
	void land() {
		System.out.println("Plane is landing");
	}
}

class Cargo extends Aeroplane {
	void land() {
		System.out.println("Cargo Plane is landing");
	}
}

class Passenger extends Aeroplane {
	void land() {
		System.out.println("Passenger Plane is landing");
	}
}

class Fighter extends Aeroplane {
	void land() {
		System.out.println("Fighter Plane is landing");
	}
}

//Parent reference to child object
class Airport {
	void allowPlane(Aeroplane ref) {
		ref.land();
	}
}

public class InheritanceExampleTwo {

	public static void main(String[] args) {
		Cargo cargo=new Cargo();
		Passenger passenger=new Passenger();
		Fighter fighter=new Fighter();
		

		// Parent reference to child object
		Airport a = new Airport();
		a.allowPlane(cargo);
		a.allowPlane(fighter);
		a.allowPlane(passenger);
	}

}