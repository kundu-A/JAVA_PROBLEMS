import java.util.*;
import java.lang.*;
class DuplicateChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING:: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			int flag=0;
			char temp=s.charAt(i);
			for(int j=0;j<s1.length();j++)
			{
				if(temp==s1.charAt(j))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				s1=s1+temp;
		}
		System.out.println("DUPLICATE CHARACTERS ARE: ");
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
					c++;
			}
			if(c>1)
				System.out.print(ch+" ");
		}	
	}
}
