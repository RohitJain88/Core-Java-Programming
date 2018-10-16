class ThrowsDemo
{
public static void main(String ar[])
{
	try
	{
	sample();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
static void sample() throws Exception
{

		  int x=10,y=0;
		  System.out.println("x= "+x+" y= "+y);
		  int z=x/y;
		  if(z==0)
    {
			  throw new ArithmeticException();
	}
	else
	{
		  System.out.println(x+" / "+y+" = "+z);
	}
}
}