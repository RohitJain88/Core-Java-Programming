class Bitcheck
{
	static public void main(String args[])
	{
		int x=80,y=2;
		int z=x<<y;//num*2^n
		int z1=x>>y;//num/2^n
		int z2=x>>>y;//num/2^n
		int z3=(-x)>>>y;//num*2^n
		System.out.println(z);//320
		System.out.println(z1);//20
		System.out.println(z2);//20
		System.out.println(z3);//
	}
}