import java.util.*;
class IndexSubstring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		System.out.println("ENTER A SUB-STRING: ");
		String s1=sc.nextLine();
		int pos=s.indexOf(s1);
		System.out.println(pos);
	}
}