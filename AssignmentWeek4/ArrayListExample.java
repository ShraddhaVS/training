package week4;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample {
public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<>();
     
     al.add("JAVA");
     al.add("C++");
     al.add("PERL");
     al.add("PHP");
     al.addAll(2,al);
    // al.add(null);
    // al.remove(2);
     System.out.println(al);
     System.out.println("Element at index 1: "+al.get(1));
  //   System.out.println("Capacity "+al.capacity());
     
     System.out.println("is java present "+al.contains("JAVA"));
     al.add(2,"PLAY");
     System.out.println(al);
     Collections.sort(al);
     System.out.println(al);
     
     for(String key: al){
         System.out.println(key);}
     
     System.out.println("Element at index 1: "+al.size());
     
     
     al.clear();
     System.out.println("After clear ArrayList:"+al);
     System.out.println("After clear ArrayList:"+al);
     System.out.println("After clear ArrayList:"+al);
     
     
}
}