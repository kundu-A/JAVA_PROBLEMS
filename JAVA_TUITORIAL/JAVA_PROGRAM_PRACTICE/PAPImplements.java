import java.util.*;
import PAP.*;
class PAPImplements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
    	int n=sc.nextInt();

        ArmstrongNumber ob1=new ArmstrongNumber();
        System.out.println("Is this number is Armstrong?----True or False?");
	    ob1.armstrong(n);

	    PalindromeNumber ob2=new PalindromeNumber();
        System.out.println("Is this number is Palindrome?----True or False?");
	    System.out.println(ob2.palindrome(n));
        
        PerfectNumber ob3=new PerfectNumber();
        System.out.println("Is this number is Perfect?----True or False?");
        ob3.perfect(n);
    }
}