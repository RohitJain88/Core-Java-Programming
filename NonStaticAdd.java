class NonStaticAdd
{
	int a=10,b=20,c;
	public static void main(String arg[])
	{

		NonStaticAdd n=new NonStaticAdd();
		n.c=n.a+n.b;
		System.out.println("Value of a :"+n.a+"\n"+"Value of b :"+n.b+"\n"+"Value of c :"+n.c);
	}
}