package Map;

import java.util.*;

public class HashMapClass {

	public static void main(String[] args) {
		
		// We will use HashMap on Automation
		
		// HashMap - fast,unsynchronized, works with single thread, allows one null key
		// HashTable - slow, synchronized, works with multiple thread, does not allow one null key
		// LinkedHashMap - preserves the insertion order
		
		
		//Map map = new HashMap();
		Map<String,String> map = new HashMap<>();
		
		map.put("myName", "Mike");   // JS has set() method, Java has put().
		map.put("myJob", "Developer");
		map.put("myAge", "25");
		map.put("x", "y");
		
		System.out.println(map);  // -> {x=y, myName=Mike, myJob=Developer, myAge=25}  //-> HashMap doesn't have order.
		
		
		// for getting the value of key
		System.out.println(map.get("myName"));    // -> Mike
		System.out.println(map.get("myName2"));   // -> null -> because there is no myName2 as key.
		
		Set<String> keys = map.keySet();  // -> It collects all keys
		
		for(String key:keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		/*Output: 
		 * x:y
		 * myName:Mike
		 * myJob:Developer
		 * myAge:25
		 */
		
	}
	

	
	
	

}