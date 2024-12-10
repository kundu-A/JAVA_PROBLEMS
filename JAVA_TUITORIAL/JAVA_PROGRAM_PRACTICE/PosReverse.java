import java.util.*;
class PosReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING: ");
		String s=sc.nextLine();
		s=s+' ';
		int pos=0,pos1=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				pos1=i;
			for(int j=pos1-1;j>=pos;j--)
				System.out.print(s.charAt(j));
			pos=pos1+1;
			System.out.print(' ');	
			}
		}
	}
}