import java.util.*;
class MatrixMultiplication
{
	public static void main(String args[])
	{
		int[][] a,b,c;
		a=new int[10][10];
		b=new int[10][10];
		c=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE: ");
		int n=sc.nextInt();
		System.out.println("YOU SHOULD PUT SAME AMOUNT OF NUMBER IN 1ST MATRIX'S ROW AND 2ND MATRIX'S COLUMN.");
		System.out.println("ENTER VALUES IN 1st ARRAY: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("ENTER VALUES IN 2nd ARRAY: ");
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
				int sum=0;
				for(int k=0;k<n;k++)
				{
					sum=sum+(a[i][k]*b[k][j]);
					c[i][j]=sum;
				}
			}
		}
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