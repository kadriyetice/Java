package Queue;

import java.util.*;

public class QueueClass {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<Integer>();

		// Add elements
		for(int i=0; i<5;i++) {
			q.add(i);
		}
		
		System.out.println(q);
		
		int removedel = q.remove();   // -> it is removing first element
		System.out.println(removedel);
		
		System.out.println(q);        // -> [1, 3, 2, 4]
		
		System.out.println(q.peek()); // -> 1 -> picking first one
		
		System.out.println(q.size()); // -> 4
	}

}