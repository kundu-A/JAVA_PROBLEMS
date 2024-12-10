interface Abc
{
	int a=10,b=20;
	void Greater(int a,int b);
	void Greater();
}
class InterfaceGreater implements Abc
{
	public static void main(String args[])
	{
		InterfaceGreater ob=new InterfaceGreater();
		ob.Greater(a,b);
		ob.Greater();
	}
	public void Greater(int a,int b)
	{
		if(a>b)
			System.out.println("THE LARGE ONE IS "+a);
		else
			System.out.println("THE LARGE ONE IS "+b);
	}
	public void Greater()
	{
		if(a>b)
			System.out.println("THE LARGE ONE IS "+a);
		else
			System.out.println("THE LARGE ONE IS "+b);
	}
}