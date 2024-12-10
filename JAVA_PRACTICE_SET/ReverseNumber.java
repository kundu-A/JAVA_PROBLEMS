class ReverseNumber
{
	int p=0;
	public static void main(String args[])
	{
		ReverseNumber ob=new ReverseNumber();
		int n=123;
		int i,add=0;
		while(n>0)
		{
			ob.p=n%10;
			add=add*10+ob.p;
			n=n/10;
		}
		System.out.println("THE REVERSE IS "+add);
	}
}