import java.util.*;
import Calculator.Add.*;
import Calculator.Sub.*;
import Calculator.Mul.*;
import Calculator.Div.*;
public class CalculatorImplement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to Addition/tEnter 2 to Subtraction/tEnter 3 to Multiplication/tEnter 4 to Division: ");
		int ch=sc.nextInt();
		System.out.println("Enter two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch)
		{
			case 1: Addition ob=new Addition();
				ob.add(a,b);
				break;
			case 2: Subtraction ob2=new Subtraction();
				ob2.sub(a,b);
				break;
			case 3: Multiplication ob3=new Multiplication();
				ob3.mul(a,b);
				break;
			case 4: Division ob4=new Division();
				ob4.div(a,b);
				break;
			default:System.out.println("Enter right choice: ");
		}
	}
}