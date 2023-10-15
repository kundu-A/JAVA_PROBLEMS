import java.lang.*;
class DuplicateRemove
{
	public static void main(String args[])
	{
		
		String s="apple";
		String s1="";
		int c=0;
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			int flag=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)==ch)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			s1=s1+ch;
		}
		System.out.println(s1);
	}
}