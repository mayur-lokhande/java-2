package java8;

public class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
	private String location;

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Employee(int id, String name, int age, long salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", location="
				+ location + "]";
	}

}
