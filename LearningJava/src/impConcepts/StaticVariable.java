package impConcepts;

class Mobile{
	String brand;
	long price;
	static String type;
	
	public void display() {
		System.out.println(brand+" : "+price+" : "+type);
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		//we can call static variable using class name and assign value to it.
		//static variable value common to all the objects of a class.
		Mobile.type="Smart Phone";
		
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=90_000;
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=80_000;
		
		obj1.display();
		obj2.display();
	}

}
