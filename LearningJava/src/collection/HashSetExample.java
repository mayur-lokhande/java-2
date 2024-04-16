package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		 Set<Integer> hs=new HashSet<Integer>();
		 hs.add(20);
		 hs.add(30);
		 hs.add(10);
		 hs.add(50);
		 hs.add(40);
		 hs.add(18);
		 hs.add(34);
		/*
		 //Hashing function= hashcode (value) % current capacity
		 // Load Factor = number of elements / total capacity; //load factor increase the hash table capacity if load factor reaches 0.75
		  * 1/16=0.06
		  * 2/16=0.13
		  * .
		  * .
		  * 12/16=0.75 // 
		  * 13/16=0.81 //current capacity *2 = 32

		 // 20 % 16 = 4
		 // 30 % 16 = 14
		 // 10 % 16 = 10
		 // 50 % 16 = 2
		 // 40 % 16 = 8
		 // 18 % 16 = 2
		 // 34 % 16 = 2
		  * 
		  * 50 18 34
		  * 
		 [] [50] [18] [20] [34] [] [] [40] [] [10] [] [] [] [30] [] []
		 
		 50, 18, 34, 20, 40 , 10, 30
		 */
		 
		 System.out.println(hs);
	}

}
