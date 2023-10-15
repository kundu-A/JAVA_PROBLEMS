import java.util.*;
class WordOccurance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING:: ");
		String s=sc.nextLine();
		s=s+' ';
		System.out.println("ENTER A WORD FOR COUNTING:: ");
		String s1=sc.nextLine();
		int pos=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				int pos1=i;
				String s2=s.substring(pos,pos1);
				if(s1.equals(s2)==true)
					c++;
				else
					pos=pos1+1;
			}
		}
		System.out.println(c);
	}
}