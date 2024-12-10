class Test3
{
	Test3()
	{
		System.out.println("THIS IS 1ST CONSTRACTOR");
	}
	Test3(int a)
	{
		System.out.println("THIS IS 2ND CONSTRACTOR");
	}
	Test3(int a,int b)
	{
		System.out.println("THIS IS 3RD CONSTARCTOR");
	}
	{
		System.out.println("THIS IS INSTANCE BLOCK");
	}
	public static void main(String ar[])
	{
		new Test3();
		new Test3(10);
		new Test3(10,20);
	}
}