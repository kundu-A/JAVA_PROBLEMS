import java.util.*;
class InsertionSort1
{
	public static void main(String args[])
	{
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE: ");
		int n=sc.nextInt();
		System.out.println("ENTER VALUES INN ARRAY:");
		for(int i=0;i<n;i++)
		{
			int temp=sc.nextInt();
			if(i==0)
				a[i]=temp;
			else
			{
				for(int j=0;j<i;j++)
				{
					if(a[j]>temp)
					{
						int swap=a[j];
						a[j]=temp;
						temp=swap;
					}
				}
				a[i]=temp;
			}
		}
		for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
	}
}