import java.util.*;
import java.lang.*;
class VC
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		int i;
		int l=s.length();
		System.out.println("THE LENGTH OF THE STRING: "+l);
		for(i=0;i<l;i++)
		{
			char c =s.charAt(i);
			if(s.charAt(i)!=' ')
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
					System.out.println(c+" vowel");
				else
					System.out.println(c+" consonent");
			}
		}
	}
}