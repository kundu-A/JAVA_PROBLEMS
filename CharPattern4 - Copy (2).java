class CharPattern4
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
				System.out.print(" ");
			for(int k=65;k<65+i;k++)
				System.out.print((char)k+" ");
			System.out.println();
		}
		for(int i=4-1;i>=1;i--)
		{
			for(int k=4-1;k>=i;k--)
				System.out.pritnln
			for(int j=65;j<=65+i;j++)
				System.out.println((char)j);
			System.out.println();
		}
	}
}