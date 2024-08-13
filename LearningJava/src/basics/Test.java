package basics;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String args[]) {
		String str="I live in India";
		HashMap<Character, Integer> count=new HashMap<>();
		char arr[]=str.toCharArray();

		for(char c:arr){
			if(count.containsKey(c)){
			count.put(c,count.get(c)+1);
			}
			else{
			count.put(c,1);
			}
		}

		for(Map.Entry<Character, Integer> entry:count.entrySet()){
			System.out.println("Occurrence of "+entry.getKey()+ " = "+entry.getValue());
		}
	}

}
