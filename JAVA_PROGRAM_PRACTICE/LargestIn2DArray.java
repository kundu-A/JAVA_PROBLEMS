import java.util.*;
class LargestIn2DArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ROW: ");
		int r=sc.nextInt();
		System.out.println("ENTER THE SIZE OF THE COLUMN: ");
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("ENTER VALUES IN ARRAY: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("YOUR 2D ARRAY IS: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		int t=-1;
		int r1=0,c1=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(ar[i][j]>t)
				{
					t=ar[i][j];
					r1=i;
					c1=j;
				}
			}
		}
		System.out.println("THE LARGEST ONE IS "+t+" AND THE POSITION IS ("+r1+","+c1+")");
	}
}