class Nstatmix
{
	int x=9,y=10,r;
void m1()
{

	r=x+y;
	System.out.println("Addition of"+x+"&"+y+" is:"+r+"\n");
}
void m2(int x,int y)
{
	r=x-y;
	System.out.println("Subtraction of"+x+"&"+y+" is:"+r+"\n");
}
int m3()
{
	r=x*x;
//	System.out.println("Method 1:"+v+"\n");
	return(r);
}
int m4(int x,int y)
{
	r=x*y;
	return(r);
	}

	public static void main (String args[]){
	Nstatmix a=new Nstatmix();
	a.m1();
	a.m2(a.x,a.y);
	a.r=a.m3();
	System.out.println("Square of"+a.x+" is:"+a.r+"\n");
	a.r=a.m4(a.x,a.y);
	System.out.println("Multiplication of"+a.x+"&"+a.y+" is:"+a.r+"\n");
}

}