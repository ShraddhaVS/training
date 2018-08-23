package week3;
import java.util.*;

public class CalendarExample {
	
	public static void main(String[] args) {
	 	    
	    Calendar c = Calendar.getInstance();	 
	   
	    System.out.println("Day : " + c.get(Calendar.DATE));	     	   
	    System.out.println("Month : " + c.get(Calendar.MONTH));	                     
	    System.out.println("Year : " + c.get(Calendar.YEAR));	    
	    System.out.println("Hour : " + c.get(Calendar.HOUR));
	    System.out.println("Minute : " + c.get(Calendar.MINUTE));
	    System.out.println("Second : " + c.get(Calendar.SECOND));
	    c.set(Calendar.DATE, 20);
	    System.out.println("Day : " + c.get(Calendar.DATE)); 
	    c.set(1996, 11, 20, 12, 00, 00);
	    System.out.println("Day : " + c.get(Calendar.DATE));	     	   
	    System.out.println("Month : " + c.get(Calendar.MONTH));	                     
	    System.out.println("Year : " + c.get(Calendar.YEAR));	    
	    System.out.println("Hour : " + c.get(Calendar.HOUR));
	    System.out.println("Minute : " + c.get(Calendar.MINUTE));
	    System.out.println("Second : " + c.get(Calendar.SECOND));
	}
	
}
