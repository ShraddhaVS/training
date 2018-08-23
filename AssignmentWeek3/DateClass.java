package week3;

import java.util.Date;

public class DateClass {
	
	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println("Current date is " + d1);
		Date d2 = new Date(2323223232L);
		System.out.println("Date represented is " + d2);
		System.out.println("After date: " + 	d1.after(d2) );
		System.out.println("Before date: " + 	d1.before(d2) );
		System.out.println("Clone: " + 	d1.clone() );
		System.out.println("Compare to: " + 	d1.compareTo(d2) );
		System.out.println("Equals: " + 	d1.equals(d2) );
		System.out.println("Get time: " + d2.getTime() );
		d2.setTime(234565434L);
		System.out.println("set time: "+ d2 );
		
	}
}