class PrimeMethod
{
	public static void main(String args[])
	{
		PrimeMethod ob=new PrimeMethod();
		ob.prime();
	}
	void prime()
	{
		int n=7,i,flag=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				System.out.println("non prime");
				break;
			}
		}
		if(flag==0)
			System.out.println("prime");
	}
}
		
		