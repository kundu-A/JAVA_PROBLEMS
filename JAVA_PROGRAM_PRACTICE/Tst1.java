class Tst1
{
	 Tst1()
	{
		this(10);
		System.out.println("THIS IS THE 1ST CONSTRACTOR");
		//this(10);  //this is not possible ,because when we call a contractor from a contractor then we must call this at first.
	}
	Tst1(int a)
	{
		System.out.println("THIS IS 2ND CONSTRACTOR");
	}
	public static void main(String args[])
	{
		new Tst1();
	}
}