import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}