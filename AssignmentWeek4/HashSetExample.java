package week4;

import java.util.HashSet;



public class HashSetExample {
	 public static void main(String a[]){
	        HashSet<String> hs = new HashSet<>();
	  
	        hs.add("first");
	        hs.add("second");
	        hs.add("third");
	        System.out.println(hs);
	        System.out.println("Is HashSet empty? "+hs.isEmpty());
	        hs.remove("third");
	        System.out.println(hs);
	    }
 
}
