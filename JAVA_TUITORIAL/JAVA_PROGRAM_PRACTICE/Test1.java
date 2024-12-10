class Example
{
	int a=25;
	static int b=35;
	public static void main(String ar[])
	{
		Test1 ob=new Test1();
		int c=20;
		//System.out.println(a);
		System.out.println(ob.a);
		System.out.println(Test.a);
		
		System.out.println(b);
		System.out.println(ob.b);
		System.out.println(Test.b);

		System.out.println(c);
		//System.out.println(ob.c);
		//System.out.println(Test.c);
	}
}