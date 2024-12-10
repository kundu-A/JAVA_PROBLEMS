import java.util.*;
class Wordcount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				c++;
		}
		System.out.println("TOTAL WORD = "+(c+1));
	}
}