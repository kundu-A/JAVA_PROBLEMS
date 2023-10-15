class FinalKeyword
{
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("Virat");
		s.append("Kohli");
		//s=s.append("kohli");// this is applicable.
		System.out.println(s);
		s=new StringBuffer("Sachin Tandulkar");
		System.out.println(s);
	
		// AFTER IMPLEMENT OF "FINAL" KEYWORD
		final StringBuffer s1=new StringBuffer("Virat");
		s1.append("Kohli");
		//s1=s1.append("kohli");// this is not applicable.
		System.out.println(s1);
		//s1=new StringBuffer("Sachin Tandulkar"); // this is  not possible because of final keyword.
		//System.out.println(s1);
		
		int a=10;
		System.out.println(a);
		a=20;
		System.out.println(a);
		final int b=10;
		System.out.println(b);
		//b=20;// this is not possible.
		//System.out.println(b);
		
	}
}