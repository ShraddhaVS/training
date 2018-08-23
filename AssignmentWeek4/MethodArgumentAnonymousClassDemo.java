package week4;

interface Manageable
{
  public void manage();
}
 
class Manager
{
  public void canManage(Manageable m)
  {
	m.manage();
  }
}
public class MethodArgumentAnonymousClassDemo
{
  public static void main(String[] args)
  {
    Manager m = new Manager();
    m.canManage (new Manageable ()	
	{
      public void manage()
      {
        System.out.println("Yes, it is being anonymously managed!");
      }			
    });
  }
}
