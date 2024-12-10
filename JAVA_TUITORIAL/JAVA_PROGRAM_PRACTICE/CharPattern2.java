class CharPattern2
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
	}
}