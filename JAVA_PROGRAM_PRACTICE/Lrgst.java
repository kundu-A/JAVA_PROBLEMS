class Lrgst
{
	int a,b,c;
	Lrgst(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void Largest()
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
	}
	public static void main(String args[])
	{
		Lrgst ob=new Lrgst(15,10,12);
		ob.Largest();
	}
		
		
}