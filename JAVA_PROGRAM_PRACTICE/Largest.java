import java.util.*;
class Largest
{
	Largest(int a,int b)
	{
		if(a>b)
			System.out.println("LARGEST NUMBER "+a);
		else
			System.out.println("LARGEST NUMBER "+b);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE 1st NUMBER: ");
		int a=s.nextInt();
		System.out.println("ENTER THE 2nd NUMBER: ");
		int b=s.nextInt();
		new Largest(a,b);
	}
}