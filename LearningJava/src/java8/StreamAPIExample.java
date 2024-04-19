package java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(302, "Mayur Lokhande", 26, 60000, "Pune"));
		employee.add(new Employee(156, "Aniket Shinde", 31, 65000, "Banglore"));
		employee.add(new Employee(453, "Shradha Jadhav", 24, 26000, "Chennai"));
		employee.add(new Employee(287, "Samiksha Vanjole", 25, 45000, "Chennai"));
		employee.add(new Employee(576, "Satish Pawar", 21, 24500, "Hyderabad"));
		employee.add(new Employee(733, "Pavan Kumar", 34, 85000, "Pune"));
		employee.add(new Employee(671, "Sudhanshu Gupta", 29, 57000, "Noida"));
		employee.add(new Employee(912, "Atish Kumar Verma", 19, 22000, "Banglore"));
		employee.add(new Employee(355, "Tushar Zagade", 28, 66000, "Kolkata"));
		employee.add(new Employee(777, "Shantanu Sinha", 44, 145000, "Mumbai"));

		List<String> names = employee.stream().filter((emp) -> emp.getSalary() > 20000 && emp.getSalary() < 40000)
				.map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);
	}

}
