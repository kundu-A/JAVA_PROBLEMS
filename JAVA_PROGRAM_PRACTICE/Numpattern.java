class Numpattern
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++ +" ");
			}
			System.out.println();
			c=c-1;
		}
	}
}
