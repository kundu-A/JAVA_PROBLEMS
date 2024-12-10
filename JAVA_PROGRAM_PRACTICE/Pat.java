class Pat
{
	public static void main(String args[])
	{
		int n,i,j;
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(r);
		System.out.println("ENTER THE RANGE: ");
		n=Integer.parseInt(in.readLine);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.pritnln();
		}
	}
}