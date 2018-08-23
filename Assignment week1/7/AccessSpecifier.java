class AccessSpecifier
{
public void increment(int a)
{
System.out.println(++a);
}
private void decrement(int a)
{
System.out.println(--a);
}
public static void main(String[] args)
{
AccessSpecifier c=new AccessSpecifier();
c.increment(2);
c.decrement(2);
}
}