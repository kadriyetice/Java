package List;

import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(10);
		values.add(1,9);   // -> it replace the 1th item with 9
		values.add(2);
		
		System.out.println(values); //--> [5, 9, 10, 2]
		
		
		
		Collections.sort(values);  // asc order --> [2, 5, 9, 10]
		
		System.out.println(values);    // [5,9,10]
		
		
		
		for(int i : values) {
			System.out.println(i);
		}

	}

}