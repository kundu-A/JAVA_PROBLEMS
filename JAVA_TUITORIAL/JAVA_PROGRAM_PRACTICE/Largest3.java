import java.util.*;
class Largest3
{
	int a,b,c;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Largest3 ob=new Largest3();
		System.out.println("ENTER THREE DIGITS: ");
		ob.a=s.nextInt();
		ob.b=s.nextInt();
		ob.c=s.nextInt();
		if(ob.a>ob.b)
		{
			if(ob.a>ob.c)
			{
				System.out.println("THE LARGEST ONE IS "+ob.a);
			}
			else
			{
				System.out.println("THE LARGEST ONE IS "+ob.c);
			}
		}
		else
		{
			if(ob.b>ob.c)
			{
				System.out.println("THE LARGEST ONE IS "+ob.b);
			}
			else
			{
				System.out.println("THE LARGEST ONE IS "+ob.c);
			}
		}
	}
}