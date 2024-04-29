package impConcepts;

class Mobile1{
	String brand;
	long price;
	static String type;
	
	public void display() {
		System.out.println(brand+" : "+price+" : "+type);
	}
	
	//3.we can not access instance variables inside static method 
	//4.because compiler don't know which objects data needs to print (if there are multiple objects then?)
	//5.we can do it indirectly by passing specific object in static method argument but it is not a good practice.
	public static void displayOne(Mobile1 obj1) {
		System.out.println("inside static method");
		System.out.println(obj1.brand+" : "+obj1.price+" : "+type);
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		//1.we can call static variable using class name and assign value to it.
		//2.static variable value common to all the objects of a class.
		Mobile1.type="Smart Phone";
		
		Mobile1 obj1=new Mobile1();
		obj1.brand="Apple";
		obj1.price=90_000;
		
		Mobile1 obj2=new Mobile1();
		obj2.brand="Samsung";
		obj2.price=80_000;
		
		obj1.display();
		obj2.display();
		
		//6.we can access static methods by class name (Without creating objects)
		Mobile1.displayOne(obj2);
	}

}
