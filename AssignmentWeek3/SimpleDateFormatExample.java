package week3;

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  
public class SimpleDateFormatExample {  
public static void main(String[] args) {  
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");  
    String strDate = formatter.format(date);  
    System.out.println("Date Format with YY/MM/DD : "+strDate);  
  
    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
  
    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
    
     formatter = new SimpleDateFormat("dd/MM/yyyy");  
    try {  
         date = formatter.parse("31/03/2015");  
        System.out.println("Date is: "+date);  
    } catch (ParseException e) {e.printStackTrace();}  
  
}  
}  
