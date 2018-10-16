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
class  Pqr  extends Xyz
{
	void sqrt()
	  {
	   double r=Math.sqrt(x);
	 System .out.println("Square root of "+x+" = "+r);
  }
}
class MultilevelInherit
{
 public static void main(String arg[])
 {
 Pqr  obj=new Pqr();
 Scanner  sc=new Scanner(System.in);
 System.out.println("Enter  a number");
 int a=sc.nextInt();
 obj.getData(a);
 obj.square();
 obj.cube();
 obj.sqrt();
 }
}