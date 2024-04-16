package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(13, "Mayur");
		map.put(8, "Aniket");
		map.put(24, "Rahul");
		map.put(33, "Anuj");
		
		/*
		 * 13 % 16 = 13
		 * 8 % 16 = 8
		 * 24 % 16 = 8
		 * 33 % 16 = 1
		 * [33] [] [] [] [] [] [] [8] [24] [] [] [] [13] [] [] []
		 */
		
		System.out.println(map);

	}

}
