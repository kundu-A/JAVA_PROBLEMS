import java.util.*;
class InsertionSort
{
	public static void main(String args[])
	{
		int[] a,b;
		a=b=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE: ");
		int n=sc.nextInt();
		System.out.println("ENTER VALUES INN ARRAY:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=a[i];
			if(i==0)
				b[i]=temp;
			else
			{
				for(int j=0;j<i;j++)
				{
					if(b[j]>temp)
					{
						int swap=b[j];
						b[j]=temp;
						temp=swap;
					}
				}
				b[i]=temp;
			}
		}
		for(int i=0;i<n;i++)
				System.out.print(b[i]+" ");
	}
}