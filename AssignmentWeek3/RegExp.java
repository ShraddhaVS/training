package week3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
class RegExp
{
    public static void main(String args[])
    {
        String text = "Good1Morning2Everyone3";
 
        String delimiter =  "\\d";
        Pattern pattern = Pattern.compile(delimiter,
                                        Pattern.CASE_INSENSITIVE);
 
        String[] result = pattern.split(text); 
 
        for (String temp: result)
            System.out.println(temp);
       
        
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");  
        boolean b = m.matches();  
        System.out.println("Match: "+b);
        
    }
}
