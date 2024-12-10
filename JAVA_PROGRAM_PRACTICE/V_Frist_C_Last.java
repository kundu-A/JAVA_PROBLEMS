import java.util.*;
class V_Frist_C_Last
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A WORD: ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u')
				System.out.print(temp);
		}
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			if(temp!='a' && temp!='e' && temp!='i' && temp!='o' && temp!='u')
				System.out.print(temp);
		}
		
	}
}
