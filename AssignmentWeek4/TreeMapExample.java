package week4;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	 public static void main(String a[]){
	        TreeMap<String, String> hm = new TreeMap<>();
	        
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
