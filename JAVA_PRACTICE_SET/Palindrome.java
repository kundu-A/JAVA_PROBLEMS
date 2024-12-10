import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER TO CHECK: ");
	int n=s.nextInt();
	int i,temp=0,add=0,p=0;
	temp=n;
	while(n>0)
	{
		p=n%10;
		add=add*10+p;
		n=n/10;
	}
	if(add==temp)
	   System.out.println("PALINDROME");
	else
	   System.out.println("NON PALINDROME");
	}
}