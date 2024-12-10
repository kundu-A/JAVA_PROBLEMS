import java.util.*;
class WordSeacrh
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING:: ");
		String s=sc.nextLine();
		s=s+' ';
		System.out.println("ENTER A WORD FOR SEARCHING:: ");
		String s1=sc.nextLine();
		int pos=0,flag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				int pos1=i;
				String s2=s.substring(pos,pos1);
				if(s1.equals(s2)==true)
				{
					flag=1;
					break;
				}
				else
					pos=pos1+1;
			}
		}
		if(flag==0)
			System.out.println("not found");
		else
			System.out.println("found");
	}
}