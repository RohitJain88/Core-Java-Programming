import java.util.*;
class DemoControlSwitch
{	static float d;
	public static void main(String ahu[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select choice");
		System.out.println("1.addn  2.subn  3.mult  4.divd");
		System.out.println("enter choice");
		int a=sc.nextInt();
		System.out.println("enter two number");
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		switch(a)
		{
			case 1:
					d=b+c;
					break;
			case 2:
					d=b-c;
					break;
			case 3:
					d=b*c;
					break;
			case 4:
					d=b/c;
					break;
			default:
					System.out.println("Invalid Choice");
	}
	System.out.println("result="+d);

}
}