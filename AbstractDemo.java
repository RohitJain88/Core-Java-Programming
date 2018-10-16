class Rectangle extends Graphics
{
  void area()
 {
  int a=w*h;
 System.out.println("Area of Rectangle = "+a);
 }
}
class Triangle extends Graphics
{
void area()
 {
  int a=(w*h)/2;
 System.out.println("Area of Triangle = "+a);
 }
}
class  AbstractDemo
{
  public static void main(String arg[])
  {
   Graphics obj;
   obj=new Triangle();
   obj.getData(50,30);
   obj.area();
   obj=new Rectangle();
   obj.getData(50,30);
   obj.area();
  }
}