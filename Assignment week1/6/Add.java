class Add
{
double a,b,d;
Add()
{
a=1;b=2;
d=a+b;
System.out.println((int)d);
}
Add(int a, int b)
{
this.a=a;
this.b=b;
d=a+b;
System.out.println((int)d);
}

Add(double a, int b)
{
this.a=a;
this.b=b;
d=a+b;
System.out.println(d);
}

public Add(Add ob)
{
a=ob.a;
b=ob.b;

double d=a+b;
System.out.println(d);
}
private void test()
{
System.out.println("d");
}
public static void main(String[] args)
{
Add c1=new Add();
Add c2=new Add(3,2);
Add c3=new Add(1.1,3);
Add c4=new Add(c3);
c1.test();
}
}