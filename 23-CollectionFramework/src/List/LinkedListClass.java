package List;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> object = new LinkedList<String>();
		
		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		
		System.out.println(object);
		
		object.remove("B");   // -> Delete B          -> [D,A,E,C,F,G]
		object.remove(3);     // -> Delete 3th   -> C -> [D,A,E,F,G]
		object.removeFirst(); // -> Delete first -> D -> [A,E,F,G]
		object.removeLast();  // -> Delete last  -> G -> [A,E,F]
		
		System.out.println(object);
		
		int size = object.size();
		System.out.println(size);
		
		System.out.println(object.get(2));
	}

}