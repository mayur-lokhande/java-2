package collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(27);
		pq.add(80);
		pq.add(40);
		pq.add(58);
		pq.add(64);
		pq.add(35);
		pq.add(6);
		pq.add(9);
		
		System.out.println(pq);
	}

}
