class CharPattern1
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=65;j<65+i;j++)
				System.out.print((char)j+" ");
			for(int k=63+i;k>=65;k--)
				System.out.print((char)k+" ");
			System.out.println();
		}
	}
}