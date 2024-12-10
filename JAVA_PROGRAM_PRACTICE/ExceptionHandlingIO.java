import java.io.*;
//import java.util.*;
class ExceptionHandlingIO
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER A INTEGER NUMBER: ");
		try {
			int a=Integer.parseInt(ob.readLine());
			System.out.println(a);
		} catch (Exception e) {
			System.err.println("Please enter a number.");
		}
	}
}