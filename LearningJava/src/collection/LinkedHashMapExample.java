package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(50);
		s.add(40);
		s.add(18);
		s.add(34);
		//Internally uses HashSet to store elements but order of insertion in maintained.
		System.out.println(s);
	}

}
