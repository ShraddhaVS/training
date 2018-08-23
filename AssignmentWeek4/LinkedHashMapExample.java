package week4;

import java.util.LinkedHashMap;
import java.util.Set;


public class LinkedHashMapExample {

	 public static void main(String a[]){
	       LinkedHashMap<String, String> hm = new LinkedHashMap<>();
	        
	        hm.put("first", "FIRST INSERTED");
	        hm.put("third", "SECOND INSERTED");
	        hm.put("second","THIRD INSERTED");
	        System.out.println(hm);
	  
	        System.out.println("Value of second: "+hm.get("second"));
	       
	        hm.remove("third");
	        System.out.println(hm);
	        System.out.println("Size of the HashMap: "+hm.size());
	        Set<String> keys = hm.keySet();
	        for(String key: keys){
	            System.out.println(key+" is "+hm.get(key));
	    }
	 }
}
