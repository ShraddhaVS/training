package week3;

import java.io.*;

class OutputStreamExample
{
  public static void main(String args[])throws Exception
  {
      OutputStream os = new FileOutputStream("file1.txt");
      byte b[] = {65, 66, 67, 68, 69, 70};
       
      
      os.write(b);
       
      os.flush();

      for (int i = 71; i <75 ; i++) 
      {
          os.write(i);
      }
       
      os.flush();
       
      os.close();
  }
}
