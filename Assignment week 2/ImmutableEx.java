package assignment;

public class ImmutableEx {
	
	int num;
	public ImmutableEx Add(ImmutableEx ob)
	{
		ImmutableEx n=new ImmutableEx() ;
		n.num=this.num;
		n.num=n.num+ob.num;
		return n;
	}
public static void main(String[] args)
{
	ImmutableEx n=new ImmutableEx();
	ImmutableEx n1=new ImmutableEx();
	n.num=5;
	n1.num=10;
	n.Add(n1);
	System.out.println(n.num);
	n=n.Add(n1);
	System.out.println(n.num);
}
}
