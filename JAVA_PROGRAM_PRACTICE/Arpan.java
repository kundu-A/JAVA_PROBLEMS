import java.util.*;
class Arpan{
	public static void main(String args[])
	{
		System.out.println("Enter two number: ");
		Scanner sc=new Scanner(System.in);
		try{
			int a=sc.nextInt();
			int b=sc.nextInt();
		}
		catch(Exception e){
			System.out.println("Enter an integer number");
		}
	}
}