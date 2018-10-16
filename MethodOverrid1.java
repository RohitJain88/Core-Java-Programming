class Rectangle
{
 int w,h;
 void getData(int k,int m)
 {
 w=k;
 h=m;
 System.out.println(" Width= "+w+" Height= "+h);
 }
 void area()
 {
  int a=w*h;
 System.out.println("Area of Rectangle = "+a);
 }
}
class Triangle extends Rectangle
{
 void area()
 {
	  super.area();
  int a=(w*h)/2;
 System.out.println("Area of Triangle = "+a);
 }
}
class  MethodOverrid1
{
  public static void main(String arg[])
  {
Triangle   obj=new Triangle();
   obj.getData(50,30);
   obj.area();
  }
}