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
		switch(ch)
		{
			case 1: int t=ob.GCD(a,b);
				System.out.println("GCD = "+t);
				break;
			case 2: int lcm=(a*b)/ob.GCD(a,b);
				System.out.println("LCM = "+lcm);
				break;
		}	
	}
	public int GCD(int a,int b)
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
		return gcd;
	}
}