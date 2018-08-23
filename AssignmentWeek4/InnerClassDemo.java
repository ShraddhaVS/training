package week4;

class OuterClass1
{ 
    static int outer_x = 10;
     
    int outer_y=20 ;
     
    private int outer_private = 30;
     
    class InnerClass
    { 
        void display()
        { 
        	
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_y = " + outer_y);    
            System.out.println("outer_private = " + outer_private);
            System.out.println(this);
        }
    
	}
}
 
public class InnerClassDemo
{
    public static void main(String[] args)
    {
        OuterClass1 outerObject = new OuterClass1();
        OuterClass1.InnerClass innerObject = outerObject.new InnerClass();
        
        innerObject.display();
         
    }
}
