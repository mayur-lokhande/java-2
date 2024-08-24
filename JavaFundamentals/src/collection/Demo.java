package collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(56);
		set.add(23);
		set.add(66);
		set.add(11);
		set.add(32);
		set.add(32);
		
		System.out.println(set);
		
		Map<String, Integer> tm=new TreeMap<String, Integer>();
		tm.put("Shine", 45);
		tm.put("FZ", 2);
		tm.put("ASD", 15);
		tm.put("Hunter", 12);
		tm.put(null, null);
		
	}

}
