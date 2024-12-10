import java.util.*;
class CaseConverts
{
	public void UpperToLower()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING IN UPPER CASE: ");
		String s=sc.nextLine();
		System.out.println(s.toLowerCase());
	}
	public void LowerToUpper()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING IN LOWER CASE: ");
		String s=sc.nextLine();
		System.out.println(s.toUpperCase());
	}
	public static void main(String args[])
	{
		CaseConverts obj=new CaseConverts();
		obj.UpperToLower();
		obj.LowerToUpper();
		CaseConverts2 ob=new CaseConverts2();
		ob.UL();	
	}
}
class CaseConverts2
{
	public void UL()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		String s1="",s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				s1=s1+(char)(s.charAt(i)-32);
			else 
				s1=s1+s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				s2=s2+(char)(s.charAt(i)+32);
			else 
				s2=s2+s.charAt(i);
		}
		System.out.println(s1+"  "+s2);
	}
}