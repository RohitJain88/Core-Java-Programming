class Nstatmethod
{
	 int v=9,r;
	void m1()
	{
		System.out.println("Method 1:"+v+"\n");
	}
	void m2(int v)
	{

		System.out.println("Method 2:"+v+"\n");
	}
	int m3()
	{

	//	System.out.println("Method 1:"+v+"\n");
		return(v);
	}
	int m4(int v)
	{

		return(v);
}
	public static void main (String args[]){
	Nstatmethod a=new Nstatmethod();
	a.m1();
	a.m2(a.v);
	a.r=a.m3();
	System.out.println("Method 3:"+a.r+"\n");
	a.r=a.m4(a.v);
	System.out.println("Method 4:"+a.r+"\n");
	}

}