import java.lang.*;
import java.util.*;
class WordSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING:: ");
		String s=sc.nextLine();
		System.out.println("ENTER A WORD TO BE SEARCH:: ");
		String s1=sc.nextLine();
		int c=0,c1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				c++;
		}
		int pos=0;
		int flag=-1;
		while(c>=0)
		{
			String temp="";
			for(int i=pos;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					pos=i+1;
					break;
				}
				else
					temp=temp+s.charAt(i);
			}
			if(s1.length()==temp.length())
			{
				for(int i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)==temp.charAt(i))
					{
						flag=0;
					}
					else
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
					c1=c1+1;				
			}
			c--;
		}
		if(flag==0)
				System.out.println("THE WORD IS FOUND.");
		else
				System.out.println("THE WORD IS  NOT FOUND.");
		//System.out.println(c);
	}
}
		