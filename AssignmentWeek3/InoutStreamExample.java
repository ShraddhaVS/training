package week3;
import java.io.*;

public class InoutStreamExample {
	
	 
	
	    public static void main(String[] args) throws Exception
	    {
	        InputStream a = null;
	        try {
	 
	            a = new FileInputStream("ABC.txt");
	 
	            System.out.println("Char : "+(char)a.read());
	            System.out.println("Char : "+(char)a.read());
	            System.out.println("Char : "+(char)a.read());
	 
	       
	            a.mark(0);
	 
	            a.skip(1);
	            System.out.println("skip() method comes to play");
	            System.out.println("mark() method comes to play");
	            System.out.println("Char : "+(char)a.read());
	            System.out.println("Char : "+(char)a.read());
	            System.out.println("Char : "+(char)a.read());
	 
	            boolean check = a.markSupported();
	            if (a.markSupported())
	            {
	               
	               a.reset();
	                System.out.println("reset() invoked");
	                System.out.println("Char : "+(char)a.read());
	                System.out.println("Char : "+(char)a.read());
	            }
	            else
	                System.out.println("reset() method not supported.");
	 
	 
	            System.out.println("geek.markSupported() supported"+
	                              " reset() : "+check);
	 
	        }
	        catch(Exception excpt)
	        {
	            
	            excpt.printStackTrace();
	        }
	        finally
	        {
	           
	            if (a!=null)
	            {
	                
	                a.close();
	            }
	        }
	    }
	

}

