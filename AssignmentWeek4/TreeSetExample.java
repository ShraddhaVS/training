package week4;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
	
    TreeSet<String> hs = new TreeSet<>();
	  
    hs.add("first");
    hs.add("third");
    hs.add("second");
    
    System.out.println(hs);
    System.out.println("Is HashSet empty? "+hs.isEmpty());
    hs.remove("third");
    System.out.println(hs);
}
}