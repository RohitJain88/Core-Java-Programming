import java.util.*;
class ArrayDemo
{
	public static void main(String arg[])
	{
		int r=0;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the dimension");
		int b=s.nextInt();
		int a[]=new int[b];
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Unsorted Array:");
		for(int i=0;i<a.length;i++)
		{
				System.out.println("a["+i+"]="+a[i]);
		}
		for(int i=0;i<a.length;i++)
		{

				r=r+a[i];

						//System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
						if(a[i]<a[j])
						{
							int temp;
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
			}
		}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<a.length;i++)
				{
						System.out.println("a["+i+"]="+a[i]);
		}
		avg=r/b;
		System.out.println("Sum="+r);
		System.out.println("Average="+avg);
}
}