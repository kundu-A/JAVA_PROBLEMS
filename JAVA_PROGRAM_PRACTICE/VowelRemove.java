import java.lang.*;
class VowelRemove
{
	public static void main(String args[])
	{
		String s="asit";
		String s1="";
		int v=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int flag=0;
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				v=v+1;
				flag=1;
			}
			if(flag==0)
			s1=s1+ch;
		}
		System.out.println(s1);
		System.out.println("TOTAL REMOVED VOWEL IS "+v);
	}
}