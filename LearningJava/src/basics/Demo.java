package basics;

abstract class GrandParent{
	GrandParent(){
		System.out.println("Grand parent class default constructor.");
	}
	public abstract void display();
}
abstract class Parent extends GrandParent{
	Parent(){
		System.out.println("parent class default constructor.");
	}
	public abstract void display();
}

class Child extends Parent{
	Child(){
		System.out.println("Child class default constructor.");
	}
	@Override
	public void display() {
//		super.display();
		System.out.println("Inside Child  display method.");
	}
}

public class Demo {
	
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		Parent p=new Child();
		p=c;
		GrandParent gp;
		gp=c;
		
		p.display();
		gp.display();
		//1
		/*int arr[]=new int[5];
		System.out.println(arr[0]);*/
		//2
		/*List<String> s = new ArrayList<>();
		s.add("Ashwin");
		s.add("Virat");
		s.add("Dhoni");
		s.add("Dube");
		s.stream().sorted((a,b) -> -1).forEach(System.out::println);*/
		try {
			
		}
		finally {
			
		}
	}

}
