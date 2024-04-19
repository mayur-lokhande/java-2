package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIObjectFiltering {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(205645, "Mayur", 26, 35000,"Pune"));
		emp.add(new Employee(213425, "Samarth", 23, 50000,"Satara"));
		emp.add(new Employee(312445, "Ketan", 22, 26000,"Mumbai"));
		emp.add(new Employee(113689, "Aakash", 20, 45000,"Indapur"));
		emp.add(new Employee(357698, "Dhiraj", 21, 33000,"Akola"));
		System.out.println("-----Ordering salary by ascending order-----");
		List<Employee> sortedBySalary = emp.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(sortedBySalary);

		List<Employee> sorted = emp.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(sorted);
		List<Employee> sorted1 = emp.stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(sorted1);

		System.out.println("-----Ordering age by ascending order-----");
		List<Employee> sorted3 = emp.stream().sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println(sorted3);
		System.out.println("-----Ordering name by ascending order-----");
		List<Employee> sorted6 = emp.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(sorted6);

		System.out.println("-----Ordering salary by descending order-----");
		List<Employee> sortedBySalary1 = emp.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary() - o1.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(sortedBySalary1);

		List<Employee> sorted2 = emp.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(sorted2);
		List<Employee> sorted5 = emp.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sorted5);

		System.out.println("-----Ordering age by descending order-----");
		List<Employee> sorted4 = emp.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println(sorted4);

		System.out.println("-----Ordering name by descending order-----");
		List<Employee> sorted7 = emp.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println(sorted7);
		
		System.out.println("=======Pune Location Employees=======");
		List<Employee> list = emp.stream().filter((employee)->employee.getLocation().contains("Pune")).collect(Collectors.toList());
		System.out.println(list);
	}

}