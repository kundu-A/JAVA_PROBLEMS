class VCCount
{
	public static void main(String args[])
	{
		String s="i am a college student";
		int v=0,c=0;
		char ch;
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
				v=v+1;
			else
			{
				if(ch!=' ')
				c=c+1;
			}
		}
		System.out.println("NUMBER OF VOWEL IS "+v+" AND NUMBER OF CONSONENT "+c);

	}
}
			