//3.How do you find the length of a string in java Explain with an example.
import java.util.*;
class StringLength
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		System.out.println(s.length());
	}
}
