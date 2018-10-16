class ConstructDemo
{
int  x;
ConstructDemo()
{
 x=5;
 System.out.println("This is default constructor x="+x);
}
ConstructDemo(int y)
{
 x=y;
 System.out.println("This is Parameterized constructor x="+x);
}
ConstructDemo(ConstructDemo y)
{
 x=y.x;
 System.out.println("This is copy constructor x="+x);
}
void square()
{
int r=x*x;
System.out.println("Square of "+x+" = "+r);
}
public static void main(String arg[])
{
ConstructDemo  cd1=new ConstructDemo();
cd1.square();
ConstructDemo  cd2=new ConstructDemo(20);
cd2.square();
ConstructDemo  cd3=new ConstructDemo(cd2);
cd3.square();


}
}