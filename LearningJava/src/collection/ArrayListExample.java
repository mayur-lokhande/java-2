package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//Integer type ArrayList
		List<Integer> a=new ArrayList<Integer>();
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		
		//traversing elements through Iterator
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//traversing elements through advanced for loop.
		for(Integer i:a) {
			System.out.println(i);
		}
		//Java 8 forEach (updated advanced for loop)
		a.forEach((i)->System.out.println(i));
		
		//String type ArrayList
		List<String> al=new ArrayList<String>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Banglore");
		al.add("Nagpur");
		al.forEach((i)->System.out.println(i));
		//we can access elements by index number (Insertion order maintained in List)
		System.out.println(al.get(3));
		
		//we can change the value of particular index number.
		al.set(3, "Satara");
		System.out.println(al.get(3));
		
		//we have employee class with id,name,address fields in same package.
		//How to add objects of type employee.
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(1,"Mayur","Baramati"));
		System.out.println(employee);
	}
}
