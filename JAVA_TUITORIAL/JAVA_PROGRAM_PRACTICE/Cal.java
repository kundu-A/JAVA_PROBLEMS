import java.util.*;
class Calculate
{
	public static void SquareArea(int a)
	{
		int r;
		r=a*a;
		System.out.println(r);
	}
	public void CircleArea(int a)
	{
		double r;
		r=3.14*a*a;
		System.out.println(r);
	}
}
public class Cal{
	public static void main(String args[])
	{
		Calculate ob=new Calculate();
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER DIGIT:: ");
		int n=s.nextInt();
		ob.SquareArea(n);
		ob.CircleArea(n);
	}
}
		