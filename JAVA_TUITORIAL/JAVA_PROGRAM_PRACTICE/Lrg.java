import java.io.*;

class Lrg
{
	int a, b;
	Lrg(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void larger()
	{
		if(a>b)
			System.out.println("LARGEST "+a);
		else
			System.out.println("LARGEST "+b);

	}
	public static void main(String arges[])
	{
		Lrg ob=new Lrg(10,15);
                ob.larger();
		
	}
}