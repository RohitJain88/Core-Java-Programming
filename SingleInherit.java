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
class SingleInherit
{
 public static void main(String arg[])
 {
 Xyz   obj=new Xyz();
 Scanner  sc=new Scanner(System.in);
 System.out.println("Enter  a number");
 int a=sc.nextInt();
 obj.getData(a);
 obj.square();
 obj.cube();
 }
}