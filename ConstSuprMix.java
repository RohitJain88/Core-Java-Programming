import java.util.Scanner;
class MethodOvr
{
	int a,b;
	MethodOvr()
	{
		System.out.println("In base Constructor");
	}
	MethodOvr(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("In base Constructor"+"\nValue of a="+a+" & b="+b);
	}
	void getData(int x)
	{
		a=x;
		System.out.println("In base Class ="+a);
	}
}
class Methodderv extends MethodOvr
{
	int p;
	Methodderv(int a,int b,int c)
	{
		super(a,b);
		System.out.println("In derived Constructor \na="+a+"\nb="+b+"\np="+p);
	}
	public void getData(int x)
	{
		super.getData(x);
		int r=x*x;
		System.out.println("In Derived Class ="+r);
	}

}
class ConstSuprMix
{
	public static void main(String args[])
	{
				MethodOvr m=new Methodderv(10,20,30);
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter the number");
				int s=s1.nextInt();
				m.getData(s);
	}
}
