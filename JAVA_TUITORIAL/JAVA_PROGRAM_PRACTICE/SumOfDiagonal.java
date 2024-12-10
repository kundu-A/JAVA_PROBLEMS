import java.util.*;
class SumOfDiagonal
{
	public static void main(String args[])
	{
		int ar[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE: ");
		int n=sc.nextInt();
		System.out.println("ENTER VALUES IN ARRAY: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sum=sum+ar[i][j];
				}
			}
		}
		System.out.println("SUM OF ALL DIAGONAL ELEMENTS OF THAT 2D ARRAY: "+sum);
	}
}