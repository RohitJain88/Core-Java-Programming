class StaticDemo
{
	static int a=12;
	public static void main(String arg[])
	{
		StaticDemo d=new StaticDemo();
		System.out.println("Value of a:"+Sample.b);
		System.out.println("Value of a:"+StaticDemo.a);
		System.out.println("Value of a:"+d.a);
	}
}