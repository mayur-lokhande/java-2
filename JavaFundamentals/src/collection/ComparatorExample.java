package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cricketers {
	private String name;
	private int age;
	private int matches;
	private int runsScored;
	private double avergae;

	public Cricketers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cricketers(String name, int age, int matches, int runsScored, double avergae) {
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
		return "Cricketers [name=" + name + ", age=" + age + ", matches=" + matches + ", runsScored=" + runsScored
				+ ", avergae=" + avergae + "]";
	}
}

//Comparator to sort by average
class AverageComparator implements Comparator<Cricketers> {

	@Override
	public int compare(Cricketers c1, Cricketers c2) {
		// TODO Auto-generated method stub
		return Double.compare(c1.getAvergae(), c2.getAvergae());
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		List<Cricketers> cricketers = new ArrayList<Cricketers>();
		cricketers.add(new Cricketers("Sachin Tendulkar", 47, 463, 18246, 45.6));
		cricketers.add(new Cricketers("Rohit Sharma", 37, 211, 10000, 60.0));
		cricketers.add(new Cricketers("Virat Kohli", 34, 263, 12000, 57.44));
		cricketers.add(new Cricketers("Youvraj Singh", 41, 256, 90000, 49.1));

		// Sort cricketers by average using comparator
		System.out.println("Sorting by average (DESC)");
		Collections.sort(cricketers,new AverageComparator());
		for(Cricketers cricketer : cricketers) {
			System.out.println(cricketer);
		}

	}

}
