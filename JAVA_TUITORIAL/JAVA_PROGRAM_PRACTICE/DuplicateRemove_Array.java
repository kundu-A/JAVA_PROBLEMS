import java.util.*;
class DuplicateRemove_Array
{
	public static void main(String args[])
	{
		int ar[],b[];
		ar=new int[10];
		b=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER "+ar.length+" VALUES: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=-1)
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					ar[j]=-1;
				}
				b[i]=ar[i];
			}
		}
		System.out.println("REMOVED ARRAY IS: ");
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}
}