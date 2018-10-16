class Abc
{
  int x=10;
}
class Xyz extends Abc
{
  int  x=20;
  void add()
  {
   int z=super.x+x;
   System.out.println("sum of "+super.x+" and "+x+" = "+z);
  }
}
class  SuperVar
{
public static void main(String arg[])
{
 Xyz  obj=new Xyz();
 obj.add();
}
}