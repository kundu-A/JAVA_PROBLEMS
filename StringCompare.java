//4.How do you compare two strings in java.

import java.util.*;
class StringCompare
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		System.out.println("ENTER ANOTHER STRING: ");
		String s1=sc.nextLine();
		if(s.equals(s1))
			System.out.println("BOTH ARE EQUALS.");
		else
			System.out.println("BOTH ARE NOT EQUALS.");
		StringCompare1 ob=new StringCompare1();
		System.out.println("AFTER IMPLEMENTING equalsIgnoreCase() method. ");
		ob.checkEquals(s,s1);
	}
}
class StringCompare1
{
	public void checkEquals(String s,String s1)
	{
		if(s.equalsIgnoreCase(s1))
			System.out.println("BOTH ARE EQUALS.");
		else
			System.out.println("BOTH ARE NOT EQUALS.");	
	}
}