import java.util.*;
import java.lang.*;
class StringPalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NAME: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(s+" IS PALINDROME");
		else
			System.out.println(s+" IS NON-PALINDROME");
	}
}
			