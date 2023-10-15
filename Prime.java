import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO CHECK: ");
		int n=s.nextInt();
		int i,flag=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				System.out.println("NON PRIME");
				break;
			}
		}
		if(flag==0)
		  System.out.println("PRIME");
		   
	}
}