import java.lang.*;
class SearchChar
{
	public static void main(String args[])
	{
		int flag=0;
		char c='y';
		String s="arpan";
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)==c)
			{
				flag=1;
				System.out.println("THE WORD IS FOUND.");
				break;
			}
		}
		if(flag==0)
			System.out.println("THR WORD ID NOT FOUND.");
	}
}