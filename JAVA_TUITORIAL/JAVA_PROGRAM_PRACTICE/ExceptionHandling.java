import java.util.*;
class ExceptionHandling
{
	public static void main(String args[])
	{
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("Enter values in array: ");
			int ar[]=new int[5];
			for(int i=0;i<ar.length;i++)
				ar[i]=sc.nextInt();
			System.out.println("Enter a position to print the value in "+ar.length);
			int pos=sc.nextInt();
			System.out.println(ar[pos]);
		}
		catch(ArithmeticException e){
			System.out.println("Enter a positive value and greater than 0.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Please enter position in the limit.");
		}
	}
}