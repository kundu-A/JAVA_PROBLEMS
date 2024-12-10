class Numpattern3
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
				System.out.print("  ");
			for(int k=i;k>=1;k--)
				System.out.print(k+" ");
			for(int j=2;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}