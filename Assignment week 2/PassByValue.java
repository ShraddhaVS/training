package assignment;

public class PassByValue {
	int d,e;
	
	public static void swap(int a, int b)
	{
		a = 30;
		b = 20;
	}
	public static void swap(PassByValue obj)
	{
		obj.d=60;
		obj.e=50;
	}
	public static void main(String[] args)
	{	
		int a=20, b=30;
		System.out.println(a+" "+b);
		swap(a,b);
		System.out.println(a+" "+b);
		PassByValue c=new PassByValue();
		c.d=50;
		c.e=60;
		System.out.println(c.d+" "+c.e);
		swap(c);
		System.out.println(c.d+" "+c.e);
		
	}
	

}
