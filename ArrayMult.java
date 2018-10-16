import java.util.*;
class ArrayMult
{
	public static void main(String arg[])
	{
		int r=0;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the dimension in row&column fashion for A");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("Enter the dimension in row&column fashion for B");
		int p=s.nextInt();
		int q=s.nextInt();

		int a[][]=new int[x][y];
		int b[][]=new int[p][q];
		//int b[][]=ArrDemo.arr;
		int c[][]=new int[3][3];
		System.out.println("Length :"+a[0].length);
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<b.length;i++)
				{
					for(int j=0;j<b[i].length;j++)
					{
						b[i][j]=s.nextInt();
					}
		}

		System.out.println("Elements of Array(A):");
		for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j]+"\t");
					}
					System.out.println();
		}
		System.out.println("Elements of Array(B):");
				for(int i=0;i<b.length;i++)
						{
							for(int j=0;j<b[i].length;j++)
							{
								System.out.print(b[i][j]+"\t");
							}
							System.out.println();
		}

		for(int i=0;i<a.length;i++)
						{
							for(int j=0;j<b[i].length;j++)
							{
							r=0;
							for(int k=0;k<a[i].length;k++)
							{
								r=r+a[i][k]*b[k][j];
							}
							c[i][j]=r;
		}
	}
	System.out.println("Mult");
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			System.out.print(c[i][j]+"\t");
		}
		System.out.println();

	}

	}
}
