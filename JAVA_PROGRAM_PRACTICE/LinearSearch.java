import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
		int ar[] = new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER "+ar.length+" VALUES: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("ENTER A NUMBER TO SEARCH: ");
		int n=sc.nextInt();
		int flag=0;
		for(int i=0;i<ar.length;i++)
		{
			if(n==ar[i])
			{
				flag=1;
				System.out.println(n+" IS FOUND.");
				break;
			}
		}
		if(flag==0)
			System.out.println(n+" IS NOT FOUND.");
	}
}