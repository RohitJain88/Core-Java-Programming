import java.util.*;
class  Abc
{
  int x;
 void getData(int y)
 {
	  x=y;
 }
   void square()
  {
   int r=x*x;
 System .out.println("Square of "+x+" = "+r);
  }
}
class  Xyz  extends Abc
{
	void cube()
	  {
	   int r=x*x*x;
	 System .out.println("Cube of "+x+" = "+r);
  }
}
class  Pqr  extends Abc
{
	void sqrt()
	  {
	   double r=Math.sqrt(x);
	 System .out.println("Square root of "+x+" = "+r);
  }
}
class HierarchyInherit
{
 public static void main(String arg[])
 {
 Pqr  obj=new Pqr();
 Scanner  sc=new Scanner(System.in);
 System.out.println("Enter  a number");
 int a=sc.nextInt();
 obj.getData(a);
 obj.square();
 obj.sqrt();
 Xyz  obj1=new Xyz();
System.out.println("Enter  another number");
  int b=sc.nextInt();
  obj1.getData(b);
 obj1.square();
 obj1.cube();
 }
}