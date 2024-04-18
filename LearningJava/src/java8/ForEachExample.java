package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	private int id;
	private String name;
	private String course;

	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

}

public class ForEachExample {

	public static void main(String[] args) {

		System.out.println("=========================List Example=========================");
		List<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student(501, "Mayur", "Java"));
		studentsList.add(new Student(601, "Omkar", "Python"));
		studentsList.add(new Student(701, "Aniket", "JavaScript"));
		studentsList.add(new Student(801, "Shubham", "React JS"));
		// prior java 8
		for (Student student : studentsList) {
			System.out.println(student);
		}
		// after java 8
		System.out.println("--------------------------------------------------");
		studentsList.forEach((student) -> System.out.println(student));
//		studentsList.forEach((student)->System.out.println(student.getName()));//for specific field

		System.out.println("=========================Set Example==========================");

		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student(51, "Mayur", "Java"));
		studentSet.add(new Student(61, "Omkar", "Python"));
		studentSet.add(new Student(71, "Aniket", "JavaScript"));
		studentSet.add(new Student(81, "Shubham", "React JS"));

		// prior java 8
		for (Student student : studentSet) {
			System.out.println(student);
		}
		System.out.println("--------------------------------------------------");
		// after java 8
		studentSet.forEach((student) -> System.out.println(student));

		System.out.println("=========================Map Example==========================");

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Mayur");
		map.put(2, "Shubham");
		map.put(3, "Omkar");
		map.put(4, "Aniket");
		map.put(5, "Rohit");
		map.put(5, "Vikrant");

		// prior java 8
		for (Entry<Integer, String> mapItems : map.entrySet()) {
			System.out.println(mapItems);
		}
		System.out.println("--------------------------------------------------");
		// after java 8
		map.forEach((k, v) -> System.out.println("Id:" + k + " Name:" + v));
	}

}