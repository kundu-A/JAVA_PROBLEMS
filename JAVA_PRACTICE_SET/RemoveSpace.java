class RemoveSpace
{
	public static void main(String args[])
	{
		String s="i am a college student";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				s1=s1+"";
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}