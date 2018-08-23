package week4;

public class AnonymousClassDemo
{
  public static void main(String[] args)
  {
	  final int a=10;
    Dog dog = new Dog() {
      public void someDog ()
      {
    	  int a=20;
        System.out.println("Anonymous Dog"+a);
      }			
    }; 
    dog.someDog();
  }
}
 
class Dog
{
  public void someDog()
  {
    System.out.println("Classic Dog");
  }
}