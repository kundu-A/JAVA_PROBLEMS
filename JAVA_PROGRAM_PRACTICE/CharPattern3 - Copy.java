class CharPattern3
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=65;j<65+i;j++)
				System.out.print((char)j+" ");
			System.out.println();
		}
		for(int i=4-1;i>=1;i--)
		{
			for(int j=65;j<65+i;j++)
				System.out.print((char)j+" ");
			System.out.println();
		}

	}
}