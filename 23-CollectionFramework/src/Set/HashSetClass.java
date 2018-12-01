package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		
		Set<Integer> values = new HashSet<Integer>();
		values.add(15);
		values.add(19);
		values.add(6);
		
		values.add(6);
		values.add(8);
		values.add(88);
		
		for(int i: values) {
			System.out.println(i);
		}
		
		/*duplicates are NOT allowed and insertion order NOT preserved
		 * Output: 
		 * 19
		 * 6
		 * 8
		 * 88
		 * 15
		 */

	}

}


//Set is child interface of Collection. If we want to represent a group of individual objects as a single entity where duplicates are NOT allowed and insertion order NOT preserved then we should go for Set. HashSet is child interface of Set. LinkedHashSet is child class of HashSet.
