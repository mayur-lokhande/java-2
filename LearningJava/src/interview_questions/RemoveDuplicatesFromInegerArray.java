package interview_questions;

import java.util.HashSet;

public class RemoveDuplicatesFromInegerArray {

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,2,4,7,8,3};
		FindDuplicates(arr);
	}
	public static void FindDuplicates(int[] array) {
		HashSet<Integer> seen=new HashSet<Integer>();
		HashSet<Integer> duplicates=new HashSet<Integer>();
		
		for(int n:array) {
			if(!seen.add(n)) {
				duplicates.add(n);
			}
		}
		System.out.println("Integer Array without duplicates: "+seen);
		System.out.println("Duplicates are: "+duplicates);
	}

}
