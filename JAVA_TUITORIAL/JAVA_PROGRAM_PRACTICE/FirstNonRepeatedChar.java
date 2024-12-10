import java.util.*;
import java.lang.*;
class Fresquency
{
	void Occurance(String s)
	{
		String s1="";
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
			if(flag==0 && ch!=' ')
				s1=s1+ch;
		}
		for(int i=0;i<s1.length();i++)
		{
			char temp=s1.charAt(i);
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==temp)
					c++;
			}
			if(c==1)
			{
				System.out.println(temp);
				break;
			}
		}
	}
}
public class FirstNonRepeatedChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING:: ");
		String s=sc.nextLine();
		Fresquency obj=new Fresquency();
		obj.Occurance(s);
	}
	
}