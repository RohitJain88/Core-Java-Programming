class Construct
{
    int a;
	public static void main(String args[])
	{
		Construct r=new Construct();
		Construct s=new Construct(50);
		Construct t=new Construct(r);
	}
		Construct()
		{
			a=10;
			System.out.println("First Constructor :"+a);
		}
		Construct(int x)
		{
			a=x*x;
			System.out.println("Second Constructor :"+a);
		}
		Construct(Construct x)
		{
			a=x.a;
			System.out.println("Copy Constructor :"+a);
		}

}