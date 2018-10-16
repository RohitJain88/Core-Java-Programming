class statMethod
{
	static int v=9,r;
static void m1()
{

	System.out.println("Method 1:"+v+"\n");
}
static void m2(int v)
{
	System.out.println("Method 2:"+v+"\n");
}
static int m3()
{

//	System.out.println("Method 1:"+v+"\n");
	return(v);
}
static int m4(int v)
{
	return(v);
}
	public static void main (String args[]){
	m1();
	m2(v);
	r=m3();
	System.out.println("Method 3:"+v+"\n");
	r=m4(v);
	System.out.println("Method 4:"+v+"\n");
}

}