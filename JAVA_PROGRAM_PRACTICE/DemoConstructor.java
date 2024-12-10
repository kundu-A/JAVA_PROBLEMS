import java.util.*;
class Demo
{
	int a;
	float b;
	public Demo()
	{
		System.out.println(a+" "+b);
	}
	public Demo(int a,float b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
}
class DemoConstructor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS: ");
		int a=sc.nextInt();
		float b=sc.nextFloat();
		Demo ob=new Demo();
		Demo obj=new Demo(a,b);
	}
}
