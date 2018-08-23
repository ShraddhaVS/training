package week4;


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		
	
    LinkedHashSet<String> hs = new LinkedHashSet<>();
	  
    hs.add("first");
    hs.add("third");
    hs.add("second");
    
    System.out.println(hs);
    System.out.println("Is HashSet empty? "+hs.isEmpty());
    hs.remove("third");
    System.out.println(hs);
}
}