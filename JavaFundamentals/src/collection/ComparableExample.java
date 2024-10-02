package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cricketer implements Comparable<Cricketer>{
	private String name;
	private int age;
	private int matches;
	private int runsScored;
	private double avergae;
	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cricketer(String name, int age, int matches, int runsScored, double avergae) {
		super();
		this.name = name;
		this.age = age;
		this.matches = matches;
		this.runsScored = runsScored;
		this.avergae = avergae;
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
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public double getAvergae() {
		return avergae;
	}
	public void setAvergae(double avergae) {
		this.avergae = avergae;
	}
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", matches=" + matches + ", runsScored=" + runsScored
				+ ", avergae=" + avergae + "]";
	}
	@Override
	public int compareTo(Cricketer other) {
		// compare cricketers by average in descending order
		return Double.compare(other.avergae, this.avergae);
	}
	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		List<Cricketer> cricketers=new ArrayList<Cricketer>();
		cricketers.add(new Cricketer("Sachin Tendulkar", 47, 463, 18246, 45.6));
		cricketers.add(new Cricketer("Rohit Sharma", 37, 211, 10000, 60.0));
		cricketers.add(new Cricketer("Virat Kohli", 34, 263, 12000, 57.44));
		cricketers.add(new Cricketer("Youvraj Singh", 41, 256, 90000, 49.1));
		
		// Sort cricketers by average using comparable
		Collections.sort(cricketers);
		
		// print sorted list

		for(Cricketer cricketer:cricketers) {
			System.out.println(cricketer);
		}
	}

}
