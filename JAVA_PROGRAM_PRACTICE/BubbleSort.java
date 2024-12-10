import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		int ar[];
		ar=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER "+ar.length+" values: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp=0;
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("THE SORTED ARRAY IS: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}		
	}
}