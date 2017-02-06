package MyCollections;

import java.util.HashMap;
import java.util.Random;

@SuppressWarnings("unused")
public class MyCollectionsMain {

	public static void main(String[] args){
		
		MyArrayList<Integer> mal = new MyArrayList<>();
		mal.add(1);
		mal.add(2);
		mal.add(3);
		mal.add(4);
		mal.add(5);
		mal.add(6);
		//mal.remove(2);
		mal.add(7);
		mal.add(8);
		mal.add(9);
		mal.add(1);
		mal.add(11);
		mal.add(12);
		//mal.remove(8);
		mal.add(13);
		mal.add(14);
		System.out.println(mal);
		System.out.println(mal.contains(5));
		System.out.println(mal.getValueAt(5));
		System.out.println(mal.indexOf(546546));
		mal.removeRange(2, 7);
		System.out.println(mal);
		System.out.println(mal.size());
		mal.setNewValueAt(2, 15);
		mal.add(7);
		System.out.println(mal);
		System.out.println(mal.lastIndexOf(1));
				
		/*class Book {    
			int id;    
			String name,author,publisher;    
			int quantity;    
			public Book(int id, String name, String author, String publisher, int quantity) {    
			    this.id = id;    
			    this.name = name;    
			    this.author = author;    
			    this.publisher = publisher;    
			    this.quantity = quantity;
			}
			@Override
			public String toString() {
				return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher
						+ ", quantity=" + quantity + "]";
			}    
			
		}      
			    //Creating map of Books    
			    MyHashMap<Integer,Book> map=new MyHashMap<Integer,Book>();    
			    //Creating Books    
			    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
			    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
			    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
			    //Adding Books to map   
			    map.put(1,b1);  
			    map.put(2,b2);  
			    map.put(3,b3);  
			    System.out.println(map);*/
		
		/*
		MyHashMap<String,Integer> hm = new MyHashMap<>();
		hm.put("Hello World", 100);
		System.out.println(hm);
		hm.put("Hello World", 10);
		System.out.println(hm);
		hm.put("Hello", 1000);
		System.out.println(hm);
		System.out.println(hm.getValueOf("Hello"));
		System.out.println(hm.getKeyOf(10));
		System.out.println(hm);
		System.out.println(hm.size());
		hm.clearAll();
		System.out.println("After clearAll() =>\n"+hm);
		*/
		
		/*Random random = new Random();
		MyHashMap<Integer,Integer> hm = new MyHashMap<>();
		int max = 10000;
		
		long startTime = System.nanoTime();
		
		for(int i=0;i<=max;i++){
			
			hm.put(random.nextInt(), random.nextInt());
			
		}
		
		System.out.print(hm);
		long endTime = System.nanoTime();
		
		HashMap<Integer,Integer> hm1 = new HashMap<>();
		long startTime1 = System.nanoTime();
		
		for(int i=0;i<=max;i++){
			
			hm1.put(random.nextInt(), random.nextInt());
			
		}
		
		System.out.print(hm1);
		long endTime1 = System.nanoTime();
		
		System.out.println("\nMyHashMap Took "+((endTime - startTime)*Math.pow(10, -6)) + " ms"); 
		System.out.println("HashMap Took "+((endTime1 - startTime1)*Math.pow(10, -6)) + " ms"); 
	*/
	}
	
}
