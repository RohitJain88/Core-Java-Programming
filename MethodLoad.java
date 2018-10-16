class MethodLoad
{
	private int a,b;
	//float a1,b1;


			MethodLoad()
			{
				a=10;
				b=20;
				System.out.println("Value of a :"+a+" & b :"+b+" in default Constructor");
			}
			void M1(int a,int b)
			{
				int r=a+b;
				System.out.println("Addition of "+a+"&"+b+" is :"+r);
			}
			void M2(float a,float b)
			{
				float r=a+b;
				System.out.println("Addition of "+a+"&"+b+" is :"+r);
			}
			void M3(int a,float b)
			{
				float r=a+b;
				System.out.println("Addition of "+a+"&"+b+" is :"+r);
			}

	public static void main(String args[])
	{
		MethodLoad r=new MethodLoad();
		r.M1(50,10);
		r.M2(10F,10F);
		r.M3(15,20f);
	}
}