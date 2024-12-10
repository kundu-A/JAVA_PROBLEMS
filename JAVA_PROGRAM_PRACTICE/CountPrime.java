import java.util.*;
public class CountPrime
{
	public static void main(String args[])
	{
		int n,flag=0,c=0;
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE RANGE: ");
		n=s.nextInt();
		System.out.println("PRIME NUMEBERS ARE GIVEN BELOW: ");
		for(int i=2;i<=n;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				c=c+1;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("TOTAL NUMBER OF PRIME IS :"+c);
	}	
}