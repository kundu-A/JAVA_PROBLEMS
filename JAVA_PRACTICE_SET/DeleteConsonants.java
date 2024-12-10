//7.Write a program to delete all consonants from the string "Hello,have a good day".(Take input from user)
import java.util.*;
class DeleteConsonants
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		System.out.println("AFTER DELETING OF ALL THE CONSONANTS FROM "+s);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
				System.out.print(s.charAt(i));
			if(s.charAt(i)==' ' || s.charAt(i)=='.' || s.charAt(i)==',')
				System.out.print(s.charAt(i));
		}
	}
}