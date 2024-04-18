package java8;

public class Candidate {

	int id;
	String name;
	long Sal;

	public Candidate(int id, String name, long sal) {
		super();
		this.id = id;
		this.name = name;
		Sal = sal;
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

	public long getSal() {
		return Sal;
	}

	public void setSal(long sal) {
		Sal = sal;
	}

}