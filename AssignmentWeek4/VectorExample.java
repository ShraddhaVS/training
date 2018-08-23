package week4;


import java.util.Collections;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		

		Vector<String> al = new Vector<>();
	     
	     al.add("JAVA");
	     al.add("C++");
	     al.add("PERL");
	     al.add("PHP");
	     System.out.println(al);
	     System.out.println("Element at index 1: "+al.get(1));
	    System.out.println("Capacity "+al.capacity());
	     
	     al.add(2,"PLAY");
	     System.out.println(al);
	     Collections.sort(al);
	     System.out.println(al);
	     
	     for(String key: al){
	         System.out.println(key);}
	     
	     System.out.println("Element at index 1: "+al.size());
	     
	     
	     al.clear();
	     System.out.println("After clear ArrayList:"+al);
	     
	}
}
