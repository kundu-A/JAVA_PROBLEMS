import java.util.*;
class UserInput
{
	public static void main(String args[])
	{
		int a,b;
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		a=ob.nextInt();
		System.out.println("ENTER THE NUMBER: ");
		b=ob.nextInt();
		System.out.println(a+","+b);
	}
}