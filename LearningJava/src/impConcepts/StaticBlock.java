package impConcepts;

class MobilePhone{
	String brand;
	int price;
	static String type;
	
	public void display() {
		System.out.println(brand+" : "+price+" : "+type);
	}
	
	//static block is used to initialize
	static {// 2. Always initialize static variable in static block because static block called only once irrespective how many objects you created.
		type="Smart Phone";
	}
}

public class StaticBlock {

	public static void main(String[] args) {

		//MobilePhone.type="Smart Phone";//1.we can initialize static variable by class name but it is not good practice. 
		
		MobilePhone o1=new MobilePhone();
		o1.brand="One Plus";
		o1.price=55000;
		
		o1.display();
	}

}
