package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cricketer implements Comparable<Cricketer>{
	private String name;
	private int matches;
	private float average;
	private int totalRuns=10000;

	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cricketer(String name, int matches, float average, int totalRuns) {
		super();
		this.name = name;
		this.matches = matches;
		this.average = average;
		this.totalRuns = totalRuns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", matches=" + matches + ", average=" + average + ", totalRuns=" + totalRuns
				+ "]";
	}

	@Override
	public int compareTo(Cricketer o) {
		if(totalRuns>o.totalRuns)
			return 1;
		else if(totalRuns<o.totalRuns)
			return -1;
		else
			return 0;
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Cricketer> l = new ArrayList<Cricketer>();
		Cricketer c1 = new Cricketer("Sachin", 100, 73.5f, 10000);
		Cricketer c2 = new Cricketer("Rohit", 50, 56.8f, 7000);
		Cricketer c3 = new Cricketer("Virat", 105, 80.6f, 9000);
		l.add(c1);
		l.add(c2);
		l.add(c3);
		for (Cricketer i : l) {
			System.out.println(i);
		}
		System.out.println("=========================================================================");
		Collections.sort(l);
		for (Cricketer i : l) {
			System.out.println(i);
		}
//		System.out.println("=========================================================================");
//		Collections.sort(l, new SampleString());
//		for (Cricketer i : l) {
//			System.out.println(i);
//		}
	}
}

//class SampleString implements Comparator<Cricketer> {
//
//	@Override
//	public int compare(Cricketer o1, Cricketer o2) {
//		if (o1.getAverage() < o2.getAverage())
//			return 1;
//		else if (o1.getAverage() > o2.getAverage())
//			return -1;
//		else
//			return 0;
//	}
//
//}
