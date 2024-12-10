class Armstrong
{
	public static void main(String args[])
	{
		int n=153,i,c=0,r=0,add=0,p=1;
		int temp=n;
		int check=n;
		while(temp!=0)
		{
			c=c+1;
			temp=temp/10;
		}
		while(n!=0)
		{
			r=n%10;
			p=1;
			for(i=1;i<=c;i++)
			{
				p=p*r;
			}
			add=add+p;
			n=n/10;
		}
		if(add==check)
			System.out.println("ARMSTRONG");
		else
			System.out.println("NON AMRSTRONG");
	}
}