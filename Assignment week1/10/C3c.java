class C3c
{
void add(int a, int b)
{
int c=a+b;
System.out.println(c);
}

void add(double a, int b)
{
double c=a+b;
System.out.println(c);
}
void add(int a, int b, int c)
{
int d=a+b+c;
System.out.println(d);
}
public static void main(String[] args)
{
C3c c1=new C3c();
c1.add(1,2);
c1.add(1.1,2);
c1.add(1,2,3);

}
}