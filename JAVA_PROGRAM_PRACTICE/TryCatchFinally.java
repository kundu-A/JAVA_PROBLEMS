import java.util.*;
class TryCatchFinally
{
	public static void  main(String args[])
	{
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value for a: ");
			int a=sc.nextInt();
			System.out.println("Enter a value for b: ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("The values of c is: "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Enter positive value greater than zero.");
		}
		finally{
			System.out.println("Finally block is always executable block remember it.");
		}
	}
}