class CharPattern5
{
	public static void main(String args[])
	{
		int n=4,c=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print((char)c++ +" ");
			System.out.println();
			c=c-1;
		}
	}
}
