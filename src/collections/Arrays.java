package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Arrays {

	public static void main(String[] args) {
		
		// create 2 collections
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Random r = new Random();
		
		// generate random numbers 1-10, 6-15
		for (int i = 0; i < 10; i++){
			list1.add(r.nextInt(10)+1);
			list2.add(r.nextInt(10)+6);
		}
		
		// print each collection and its size
		System.out.println("ArrayList1 size: " + list1.size());
		System.out.print("ArrayList1: ");
		for(Integer num: list1){
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("ArrayList2 size: " + list2.size());
		System.out.print("ArrayList2: ");
		for(Integer num: list2){
			System.out.print(num+" ");
		}
		System.out.println();
		
		// add all of list2 to list1 and sort
		list1.addAll(list2);
		Collections.sort(list1);

		// add list1 to a set first so there are no duplicates
		Set<Integer> set = new HashSet<Integer>(list1);
		ArrayList<Integer> list3 = new ArrayList<Integer>(set);
		
		System.out.println("ArrayList3 size: " + list3.size());
		System.out.print("ArrayList3: ");
		for(Integer num: list3){
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println();
		
		// find middle element and remove it
		System.out.println("Removing middle element: " + list3.get(list3.size()/2));
		list3.remove(list3.size()/2);
		
		for(Integer num: list3){
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Reversing ArrayList3: ");
		Collections.reverse(list3);
		System.out.println("Final ArrayList3 size: " + list3.size());
		System.out.print("Final ArrayList3: ");
		for(Integer num: list3){
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println();
		
		/* Creating a collection that holds key/value pairs.	
		 * Key/Value collections cannot have duplicates, so 
		 * in order to be able to add the duplicate key/value
		 * pair I used an ArrayList of HashMaps, where each
		 * element is a HashMap holding a key/value pair. 
		 * */
		HashMap<Integer, String> map;
		ArrayList<HashMap<Integer, String>> keyvaluelist = new ArrayList<HashMap<Integer, String>>(4);
		for (int i = 0; i < 5; i++){
			map = new HashMap<Integer, String>();
			map.put(i, "String " + Integer.toString(i));
			keyvaluelist.add(map);	
		}
		
		System.out.println("Init. key/value Collection: " + keyvaluelist);

		// adding a key/value pair that would be a duplicate: {1, String 1}
		map = new HashMap<Integer, String>();
		map.put(1, "String 1");
		keyvaluelist.add(map);
		
		System.out.println("Init. key/value Collection + dupe: " + keyvaluelist);
		System.out.println();
		
		/* Search collection to see if there is a duplicate. To do this
		 * I'll add all elements of the collection to a set, as sets 
		 * can't have dupes. If set.add() returns false print the dupe.
		 */
		Set<HashMap<Integer, String>> keyvalueset = new HashSet<HashMap<Integer, String>>();
		for (HashMap<Integer,String> elem : keyvaluelist){
			if (!keyvalueset.add(elem))
				System.out.println("Dupe: " + elem);
		}
		System.out.println();
		// printing original collection and size
		System.out.println("Collection: " + keyvaluelist);
		System.out.println("Collection size: " + keyvaluelist.size());
//		System.out.println("Collection w/o duplicate: " + keyvalueset);
//		System.out.println("Collection w/o duplicate size: " + keyvalueset.size());
	}
	
}
