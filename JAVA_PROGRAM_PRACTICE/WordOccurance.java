import java.util.*;
class WordOccurance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		int c=0,cou=0;
		System.out.println("ENTER A WORD: ");
		String temp=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				c++;
		}
		int pos=0;
		while(c>=0)
		{
			String s1="";
			for(int i=pos;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					pos=i+1;
					break;
				}
				else
					s1=s1+s.charAt(i);
			}
			int flag=-1;
			if(s1.length()==temp.length())
			{
				for(int i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)==temp.charAt(i))
						flag=0;
					else
					{
						flag=1;
						break;
					}

				}
			}
			if(flag==0)
			cou++;
			c--;
		}
		System.out.println(cou);
		
	}
}