import java.util.*;
public class Parent
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("ENTER TWO NUMBER: ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void disp()
	{
		System.out.println(a+b);
	}
}
public class Child extends Parent
{
	public void disp()
	{
		if(a>b)
			System.out.println("THE GREATEST ONE IS: "+a);
		else
			System.out.println("THE GREATEST ONE IS: "+b);
	}
	public static void main(String args[])
	{
		Child ob=new Child();
		ob.getData();
		ob.disp();
	}
}