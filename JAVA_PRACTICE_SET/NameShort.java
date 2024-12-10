import java.util.*;
class NameShort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY NAME:: ");
		String s=sc.nextLine();
		int c=0,pos=0,c1=0;
		System.out.print(s.charAt(0));
		System.out.print(" ");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				c++;
		}
		int flag=0;
		for(int i=1;i<s.length();i++)
		{
			if(flag==1)
				System.out.print(s.charAt(i));
			else if(s.charAt(i)==' ')
			{
				c1++;
				if(c1==c)
					flag=1;
				else
				{
					System.out.print(s.charAt(i+1));
					System.out.print(" ");
				}
			}
		}
	}
}