import java.util.*;
import java.lang.*;
class NameShort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING:: ");
		String s=sc.nextLine();
		String s1="";
		System.out.println("PLEASE WRITE YOUR GENDER:: ");
		String gender=sc.nextLine();	
		if(gender.charAt(0)=='m' || gender.charAt(0)=='M')
			System.out.print("Mr.");
		else 
		{	
			if(gender.charAt(0)=='f' || gender.charAt(0)=='F')
			{
				System.out.println("WRITE YOUR MARITAL STATUS::" );
				String status=sc.nextLine();
				if(status.charAt(0)=='m' || status.charAt(0)=='M')
					System.out.print("Mrs.");
				else{
					 if(status.charAt(0)=='u' || status.charAt(0)=='U');
					 	System.out.print("Miss.");
					 
				     }
			}
		}
		s1=s1+s.charAt(0)+'.';
		int c=0;
		int pos=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				c++;
		}
		int flag=0;
		while(c>0)
		{
			if(c==1)
			{
				flag=1;
				break;
			}
			else
			{
				for(int i=pos;i<s.length();i++)
				{
					if(s.charAt(i)==' ')
					{
						s1=s1+s.charAt(i+1)+'.';
						pos=i+1;
						break;
					}
				}
			}
			c--;
		}
		if(flag==1)
		{
			for(int i=pos;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					int temp=i;
					for(int j=temp;j<s.length();j++)
						s1=s1+s.charAt(j);
				}
			}
		}
		System.out.println(s1);
	}
}