import java.util.*;
import java.lang.*;
class LowerToUpper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.substring(4));
		System.out.println(s.substring(2,6));
	}
}
