import java.util.*;
class Febo
{
	public void Febo(int n)
	{
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
public class Febonacci
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Febo ob=new Febo();
		System.out.println("ENTER THE NUMBER: ");
		int n=s.nextInt();
		ob.Febo(n);
	}
}
			