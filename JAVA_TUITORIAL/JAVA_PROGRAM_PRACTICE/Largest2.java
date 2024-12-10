class Largest2
{
	int a=10,b=20,c=30;
	public statis void main(String args[])
	{
		Largest2 ob=new Largest2();
		if(ob.a>ob.b)
		{
			if(ob.a>ob.c)
			{
				System.out.println("THE LARGEST ONE IS "+a);
			}
			else
			{
				System.out.println("THE LARGEST ONE IS "+c);
			}
		}
		else
		{
			if(ob.b>ob.c)
			{
				System.out.println("THE LARGEST ONE IS "+b);
			}
			else
			{
				System.out.println("THE LARGEST ONE IS "+c);
			}
		}
	}
}