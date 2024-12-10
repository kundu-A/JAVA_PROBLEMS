import java.util.*;
class VowelRemove1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int flag=0;
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				flag=1;
			if(flag==0)
			s1=s1+ch;
		}
		System.out.println(s1);
	}
}