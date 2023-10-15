//2.How do you concatenate two strings in java and gove an example.
import java.util.*;
class ConcatenateStrings
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		System.out.println("ENTER ANOTHER STRING: ");
		String s1=sc.nextLine();
		System.out.println(s+s1);
	}
}