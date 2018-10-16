import java.util.*;
class DemocontrolStar
{
	public static void main(String ahu[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for star pattern");
		int a=sc.nextInt();

		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}
}