import java.util.*;
class ArrayAdd
{
	public static void main(String args[])
	{
		int ar[]={10,20,30,40,50};
		System.out.println(ar.length);
		Scanner sc=new Scanner(System.in);
		int add=0;
		for(int i=0;i<ar.length;i++)
		{
			add=add+ar[i];
		}
		System.out.println(add);
	}
}