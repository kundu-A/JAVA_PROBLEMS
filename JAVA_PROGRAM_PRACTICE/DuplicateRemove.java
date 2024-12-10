import java.util.*;
class DuplicateRemove
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter a word with duplicate characters: ");
		String s=sc.nextLine();
		s=s.toLowerCase();
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
			if(flag==0)
			s1=s1+ch;
		}
		System.out.println(s1);
		sc.close();
	}
}