import java.util.*;
class GCD_LCM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBER: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		GCD_LCM ob=new GCD_LCM();
		System.out.println("PRESS 1 FOR GCD/HCF\tPRESS 2 FOR LCM: ");
		int ch=sc.nextInt();
		Switch(ch)
		{
			case 1:ob.GCD(a,b);
				break;
			case 2:ob.LCM();
				break;
		}	
	}
	public void GCD(int a,int b)
	{
		int n=0,gcd=0;
		if(a<b)
			n=a;
		else
			n=b;
		for(int i=1;i<=n/2;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(gcd<i)
					gcd=i;
			}
		}
		System.out.println("GCD OF "+a+" AND "+b+" IS "+gcd);
	}
	public void LCM
	{
		GCD obj=new GCD();
		int lcm=(a*b)/ob.gcd;
		System.out.println(lcm);
	
	}
}