import java.util.*;
class RemoveCharacter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		System.out.println("ENTER THE POSITION: ");
		int pos=sc.nextInt();
		String s1="";
		s1=s1+(s.substring(0,pos))+(s.substring(pos+1,s.length()));	
		System.out.println(s1);
	}
}