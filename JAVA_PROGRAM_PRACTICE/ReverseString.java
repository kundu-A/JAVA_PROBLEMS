import java.util.*;
class ReverseString
{
	public static void main(String ags[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
			s1=s1+s.charAt(i);
		System.out.println(s1);
	}
}