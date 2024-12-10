import java.util.*;
class Addition2Matrix
{
	public static void main(String args[])
	{
		int a[][],b[][],c[][];
		a=new int[10][10];
		b=new int[10][10];
		c=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE OF 1ST ARRAY: ");
		int n=sc.nextInt();
		System.out.println("ENTER VALUES IN ARRAY: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("ENTER VALUES IN ARRAY: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("THE RESULT OF ADDITON IS: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}