class MethodDemo
{
  void  square(int n)
  {
    int r=n*n;
    System.out.println("Square of "+n+"  = "+r);
  }
 static int  cube(int n)
    {
      int r=n*n*n;
     return r;
  }
  public static void main(String arg[])
  {
   MethodDemo md=new MethodDemo();
   int a=10;
   md.square(a);
   int c=cube(a);
    System.out.println("cube of "+a+"  = "+c);
  }
}