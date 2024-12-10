import java.util.*;
class ArrayTest
{
	public static void main(String args[])
	{
		int ar[];
		ar=new int[10];
		int l=ar.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER "+l+" values: ");
		for(int i=0;i<l;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("VALUES OF ARRAY: ");
		for(int i=0;i<l;i++)
		{
			System.out.print(ar[i]+" ");
		}		
	}
}