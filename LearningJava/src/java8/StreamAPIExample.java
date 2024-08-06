package java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(302, "Mayur Lokhande", 26, 60000, "Pune"));
		employee.add(new Employee(156, "Aniket Tapre", 31, 65000, "Banglore"));
		employee.add(new Employee(453, "Shradha Jadhav", 24, 26000, "Chennai"));
		employee.add(new Employee(287, "Samiksha Vanjole", 25, 45000, "Chennai"));
		employee.add(new Employee(576, "Satish Pawar", 21, 24500, "Hyderabad"));
		employee.add(new Employee(733, "Pavan Kumar", 34, 85000, "Pune"));
		employee.add(new Employee(671, "Sudhanshu Gupta", 29, 57000, "Noida"));
		employee.add(new Employee(912, "Aakash Kumar", 19, 22000, "Banglore"));
		employee.add(new Employee(355, "Tushar Zagade", 28, 66000, "Kolkata"));
		employee.add(new Employee(777, "Shantanu Sinha", 44, 145000, "Mumbai"));

		//print names of employees whose salary is less than 40k and greater than 20k
		/*List<String> names = employee.stream().filter((emp) -> emp.getSalary() > 20000 && emp.getSalary() < 40000)
				.map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);*/
		
		//List of employees whose location is chennai
		/*List<String> emps=employee.stream().filter((emp)->emp.getLocation()=="Chennai").map((emp)->emp.getName()).collect(Collectors.toList());
		System.out.println(emps);*/
		
		//count number of employees working from Pune location
		/*Integer employees=employee.stream().filter((emp)->emp.getLocation()=="Pune").map((emp)->emp.getName()).collect(Collectors.toList()).size();
		System.out.println(employees);*/
		
		//Sort by name ascending
		//employee.stream().map((e)->e.getName()).sorted().forEach(System.out::println);
		
		//Sort names by descending
		//employee.stream().map((e)->e.getName()).sorted((e1,e2)->e2.compareTo(e1)).forEach(System.out::println);
		
		//Calculate sum of all employees salary
		/*Double sum=employee.stream().mapToDouble((emp)->emp.getSalary()).sum();
		System.out.println(sum);
		//another method
		long sum1=employee.stream().map((e)->e.getSalary()).reduce(0L,(s,num)->s+num);
		System.out.println(sum1);
		//Calculate sum for Chennai location
		long total=employee.stream().filter((e)->e.getLocation()=="Chennai").map((e)->e.getSalary()).reduce(0L, (a,r)->a+r);
		System.out.println(total);*/
		
		//print minimum salary from chennai location
		Long l=employee.stream().filter((e)->e.getLocation()=="Chennai").map((e)->e.getSalary()).min((n1,n2)->n1.compareTo(n2)).get();
		System.out.println(l);
		//print name of employee whose salary is minimum and location is chennai
		Optional<String> map = employee.stream().filter((e)->e.getLocation()=="Chennai").min((e1,e2)->Long.compare(e1.getSalary(), e2.getSalary())).map((e)->e.getName());
		System.out.println(map);
	}

}
