import java.util.*;
class Test
{
	public boolean isAcronym(String ar[],String s)
	{
		int flag=0;
		if(ar.length==s.length()){
		for(int i=0;i<ar.length;i++)
		{
			String temp=ar[i];
			if(temp.charAt(0)==s.charAt(i))
				flag=0;
			else
			{
				flag=1;
				break;
			}
				
		}
		}
		else
			flag=1;
		if(flag==1)
		return false;
		else
		return true;
	}
}
class StringAcronym
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String ar[]=new String[3];
		System.out.println("ENTER WORDS: ");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextLine();
		System.out.println("ENTER A WORD: ");
			String s=sc.nextLine();
		Test ob=new Test();
		boolean a=ob.isAcronym(ar,s);
		System.out.println(a);
	}
}