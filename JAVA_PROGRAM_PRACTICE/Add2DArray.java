import java.util.*;
class Add2DArray
{
	public static void main(String args[])
	{
		int ar[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("YOUR 2D ARRAY IS: ");
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("SUM OF 2D ARRAY IS: ");
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum=sum+ar[i][j];
			}
			System.out.println(sum);
		}
	}
}