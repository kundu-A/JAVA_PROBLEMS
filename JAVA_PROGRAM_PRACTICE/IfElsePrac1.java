import java.util.*;
class IfElsePrac1
{
	public static void main(String agrs[])
	{
		int n;
		System.out.println("ENTRE THE NUMBER TO CHECK: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n>0)
			System.out.println(n+" is positive");
		else
			System.out.println(n+" is negative");
	}
}