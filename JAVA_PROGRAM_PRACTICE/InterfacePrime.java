interface Abc
{
	int n=7;
	void Prime();
}
class InterfacePrime implements Abc
{
	public static void main(String args[])
	{
		InterfacePrime ob=new InterfacePrime();
		ob.Prime();
	}
	public void Prime()
	{
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("THIS NUMBER IS NOT PRIME");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("THIS NUMBER IS PRIME");
	}
}