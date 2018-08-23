package week3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDays {
	public static void main(String[] args) {
		
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar c = Calendar.getInstance();
	c.setTime(new Date()); 
	c.add(Calendar.DATE, 5); 
	String output = sdf.format(c.getTime());
	System.out.println(output);
}
}