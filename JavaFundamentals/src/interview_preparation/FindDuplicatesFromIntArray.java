package interview_preparation;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesFromIntArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,4,5,1};
		Set<Integer> seen=new HashSet<Integer>();
		Set<Integer> duplicates=new HashSet<Integer>();
		
		for(int n:arr) {
			if(!seen.add(n)) {
				duplicates.add(n);
			}
		}
		System.out.println("Duplicates are: "+duplicates);
		
	}

}
