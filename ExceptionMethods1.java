class ExceptionMethods1
{
public static void main(String ar[])
{			try{
		  int x=10,y=0;
		  System.out.println("x= "+x+" y= "+y);
		  int z=x/y;
		  System.out.println(x+" / "+y+" = "+z);
		}catch(Exception  e)
		 {
			  //System.out.println("Error is "+e);
				 String s=e.getMessage();
			  //System.out.println("Error is "+e1);
		 		System.out.println(s);
		 }

		 System.out.println("Hello");
	}
}