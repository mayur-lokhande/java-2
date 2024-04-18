package java8;

import java.util.Optional;

public class OptionalClassExample {

	public static String abc() {
		System.out.println("sssssssssss");
		return "aaaa";
	}

	public static void main(String[] args) {
		String name = "Mayur Lokhande";
		// empty() does not contain anything. it is just empty.
//		Optional<String> emptyOptional=Optional.empty();//returns empty object of Optional class.
//		if (emptyOptional.isPresent())
//			System.out.println(emptyOptional);
//		else {
//			System.out.println("No value present.");
//		}
//		name = null;
//		Optional<String> ofOptional=Optional.ofNullable(name);//return NullPointerException if value is null.
////		if (ofOptional.isPresent())
//			System.out.println(ofOptional.filter(name1 -> name1.charAt(0)=='L').orElseThrow(()-> new IllegalArgumentException("Email not exists.")));
//		name = null;
//		Optional<String> ofNullable = Optional.ofNullable(name);//returns Optional.empty if value is null.
//		//isPresent() method of Optional class
//		if(ofNullable.isPresent()) {
//			System.out.println(ofNullable.get());
//		}
//		else {
//			System.out.println("No value present.");
//		}

		// orElse() method of Optional class- It returns default value when value is
		// null
//		String email="mayur@gmail.com";
//		Optional<String> stringOptional = Optional.ofNullable(email);
//		String defaultValue1=stringOptional.orElse("default@gmail.com");
//		System.out.println(defaultValue1);
//		
//		//works same like orElse but we can use lambda expression here
//		String defaultVal=stringOptional.orElseGet(() -> "default@gmail.com");
//		System.out.println(defaultVal);
//		
//		//orElseThrow- throws exception when value is not present or null.
//		String optionalObject=stringOptional.orElseThrow(()-> new IllegalArgumentException("Email not exists."));
//		System.out.println(optionalObject);

		//

//		OptionalClassExample test = new OptionalClassExample();
//	        String phone;
//	        System.out.println("------------- Scenario 1 - orElse() --------------------");
//	        System.out.println("  1.1. Optional.isPresent() == true (Redundant call)");
//	        Optional<String> s = test.findMyPhone(10);
//	        phone = s.orElse(test.buyNewExpensivePhone());
//	        System.out.println("\tUsed phone: " + phone + "\n");
//
//	        System.out.println("  1.2. Optional.isPresent() == false");
//	        phone = test.findMyPhone(-1).orElse(test.buyNewExpensivePhone());
//	        System.out.println("\tUsed phone: " + phone + "\n");
//
//	        System.out.println("------------- Scenario 2 - orElseGet() --------------------");
//	        System.out.println("  2.1. Optional.isPresent() == true");
//	        // Can be written as test::buyNewExpensivePhone
//	        phone = test.findMyPhone(10).orElseGet(() -> test.buyNewExpensivePhone());
//	        System.out.println("\tUsed phone: " + phone + "\n");
//
//	        System.out.println("  2.2. Optional.isPresent() == false");
//	        phone = test.findMyPhone(-1).orElseGet(() -> test.buyNewExpensivePhone());
//	        System.out.println("\tUsed phone: " + phone + "\n");

		Candidate c1 = new Candidate(1, "Raj", 10000);
		Candidate c2 = new Candidate(2, "Mayur", 20000);
		Candidate c3 = new Candidate(3, "Aniket", 30000);

		System.out.println(Optional.ofNullable(c1).map(Candidate::getSal).filter(q -> q == 10000));

	}

	public Optional<String> findMyPhone(int phoneId) {
		return phoneId == 10 ? Optional.of("MyCheapPhone") : Optional.empty();
	}

	public String buyNewExpensivePhone() {
		System.out.println("\tGoing to a very far store to buy a new expensive phone");
		return "NewExpensivePhone";
	}

}