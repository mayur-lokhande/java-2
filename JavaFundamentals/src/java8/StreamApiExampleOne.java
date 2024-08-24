package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiExampleOne {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Mayur", "Lokhande", 26, "Software Engineer", 85000, "Pune"));
		list.add(new Employee(2, "Harshal", "Shinde", 22, "UI Developer", 35000, "Mumbai"));
		list.add(new Employee(3, "Sanjay", "Jagtap", 25, "Software Developer", 37000, "Noida"));
		list.add(new Employee(4, "Aniket", "Bhapkar", 33, "HR", 55000, "Pune"));
		list.add(new Employee(5, "Sushant", "Yadav", 26, "Java Developer", 40000, "Bangalore"));
		list.add(new Employee(6, "Omkar", "Bhise", 30, "Software Engineer", 55000, "Pune"));
		list.add(new Employee(7, "Dipak", "Zagade", 40, "Team Lead", 64000, "Nagpur"));
		list.add(new Employee(8, "Rushikesh", "Rajapure", 38, "Senior Software Engineer", 40000, "Hyderabad"));
		list.add(new Employee(9, "Shantanu", "Borate", 45, "Senior Manager", 74000, "Kolkata"));
		list.add(new Employee(10, "Mahesh", "Jadhav", 29, "React Developer", 45000, "Chennai"));

		// stream to apply two filters
		List<Employee> result1 = list.stream().filter((emp) -> emp.getAge() > 30 && emp.getLocation() == "Pune")
				.collect(Collectors.toList());
		System.out.println(result1);

		// stream to print character sequence matching elements
		List<Employee> result2 = list.stream().filter((emp) -> emp.getFirstName().contains("sh"))
				.collect(Collectors.toList());
		System.out.println(result2);

		// count total number of employees whose salary is >50000
		long counter1 = list.stream().filter((emp) -> emp.getSalary() >= 50000).count();
		System.out.println(counter1);

		// Find the employee with the maximum salary
		Optional<Employee> res = list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		System.out.println(res);

		// Find the employee with the maximum salary using method references
		Optional<Employee> res1 = list.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(res1);

		// Convert all first names in a list to uppercase
		List<String> result3 = list.stream().map((e) -> e.getFirstName().toUpperCase()).collect(Collectors.toList());
		System.out.println(result3);

		// find any element from list
		Optional<Employee> any = list.stream().findAny();
		System.out.println(any);

		// find first element from list
		Optional<Employee> first = list.stream().findFirst();
		System.out.println(first);
	}

}
