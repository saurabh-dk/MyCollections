package MyCollections;

import java.util.HashMap;
import java.util.Random;

public class HashMapWithArrayList {

	public static void main(String[] args) {
		
		Random random = new Random();
		MyOldHashMap<Integer,Integer> hm = new MyOldHashMap<>();
		int max = 10000;
		
		long startTime = System.nanoTime();
		
		for(int i=0;i<=max;i++){
			
			hm.put(random.nextInt(), random.nextInt());
			
		}
		
		System.out.print(hm);
		long endTime = System.nanoTime();
		//System.out.println("Took "+((endTime - startTime)*Math.pow(10, -6)) + " ms"); 
			
		HashMap<Integer,Integer> hm1 = new HashMap<>();
		long startTime1 = System.nanoTime();
		
		for(int i=0;i<=max;i++){
			
			hm1.put(random.nextInt(), random.nextInt());
			
		}
		
		System.out.print(hm1);
		long endTime1 = System.nanoTime();
		
		System.out.println("\nMyHashMap Took "+((endTime - startTime)*Math.pow(10, -6)) + " ms"); 
		System.out.println("HashMap Took "+((endTime1 - startTime1)*Math.pow(10, -6)) + " ms"); 
		System.out.println("Bye");
	}

}
