class NonStaticDemo
{
	int a=10;
	public static void main(String arg[])
	{

		NonStaticDemo n=new NonStaticDemo();
		System.out.println("Value of a :"+n.a);
	}
}