import java.util.*;
import java.lang.*;
class StringMethod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTRE THE RANGE: ");
		String s=sc.nextLine();
		System.out.println(s.indexOf('r'));
		System.out.println(s.replace('a','b'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		String n="ASIT";
		Boolean b=n.equals("asit");
		System.out.println(b);
		Boolean B=n.equalsIgnoreCase("asit");
		System.out.println(B);
		System.out.println(s.length());
	}
}