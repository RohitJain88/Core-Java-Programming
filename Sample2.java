import java.util.*;
class Sample
{
	float x;
	void sqrt()
	{
		Scanner s=new Scanner(System.in);
		x=s.nextFloat();
		int b=Math.round(x);
		System.out.println("Round in Sample1="+b);
	}

}
class Sample1 extends Sample
{
	void square()
	{
		float a;
		a=x*x;
		System.out.println("Sqaure root in Sample1="+a);

	}
}
class Sample2
{
	public static void main(String arg[])
		{
			int a=10;
			int b=a++;
			int c=++a;
			System.out.println(a+"\n"+b+"\n"+c);
			Sample1 s1=new Sample1();
			s1.sqrt();
			s1.square();
	//		s1.not();
}
}