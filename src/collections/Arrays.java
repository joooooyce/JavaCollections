package collections;

import java.util.ArrayList;
import java.util.Random;

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
	}
	
}
