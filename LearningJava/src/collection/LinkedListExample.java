package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//adding elements at the ending of previous elements by using add method
		List<Employee> employee=new LinkedList<Employee>();
		employee.add(new Employee(123,"Mayur","Pune"));
		employee.add(new Employee(23,"Mahesh","Pandharpur"));
		employee.add(new Employee(78,"Ganesh","Baramati"));
		employee.add(new Employee(36,"Aniket","Akola"));
		System.out.println(employee);
		
		//adding elements at the beginning of previous elements by using push method
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.push(11);
		ll.push(23);
		ll.push(45);
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
	}

}
