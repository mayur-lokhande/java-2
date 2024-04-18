package java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceExampleFour {
	// reference to a constructor
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("abc");
		l.add("xyz");
		l.add("pqr");
		l.add("lmn");
		l.add("xyz");
		// using lambda expression
		Function<List<String>, Set<String>> setFunction = (list) -> new HashSet<>(list);
		System.out.println(setFunction.apply(l));
		// using method reference
		Function<List<String>, Set<String>> setFun = HashSet::new;
		System.out.println(setFun.apply(l));
	}

}