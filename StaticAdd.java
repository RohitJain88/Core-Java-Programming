class StaticAdd
{
	static int a=10,b=20,c;

	public static void main(String arg[])
	{

		StaticDemo d=new StaticDemo();
		c=StaticDemo.a+b;
		System.out.println("Value of a:"+a+"\n"+"Value of b:"+b+"\n"+"Value of c:"+c);
}

}