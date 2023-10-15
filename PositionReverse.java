import java.util.*;
class PositionReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		String ar[]=s.split(" ");
		for(String i:ar)
		{
			for(int j=i.length()-1;j>=0;j--)
				System.out.print(i.charAt(j));
			System.out.print(' ');

		}
	}
}