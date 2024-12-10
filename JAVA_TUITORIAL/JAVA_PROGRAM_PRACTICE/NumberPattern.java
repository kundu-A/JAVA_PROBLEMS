import java.util.*;
class NumberPattern
{
	public static void main(String args[])
	{
		int ar[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE OF THE MATRIX: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}