import java.util.*;
class Check
{
	int palindrome(int n)
	{
		int temp=0,r=0,add=0;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			add=add*10+r;
			n=n/10;
		}
		if(add==temp)
			return 1;
		else
			return 0;
	}
	int Prime(int n)
	{
		int flag=0;
		int i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return 1;
		else
			return 0;
	}
	int Armstrong(int n)
	{
		int temp,store,c=0,p=1,r=0,add=0;
		temp=n;
		store=n;
		while(temp!=0)
		{
			c++;
			temp=temp/10;
		}
		while(n!=0)
		{
			r=n%10;
			p=1;
			for(int i=1;i<=c;i++)
			{
				p=p*r;
			}
			add=add+p;
			n=n/10;
		}
		if(add==store)
			return 1;
		else
			return 0;
	}                                          
}
class PAP
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		int n=s.nextInt();
		Check obj=new Check();
		int result=obj.palindrome(n);
		if(result==1)
		System.out.println("THIS NUMBER PALINDROME.");
		int result1=obj.Prime(n);
		if(result1==1)
		System.out.println("THIS NUMBER IS PRIME.");
		int result2=obj.Armstrong(n);
		if(result2==1)
		System.out.println("THIS NUMBER IS ARMSTRONG.");
		if(result==0 && result1==0 && result2==0)
		System.out.println("THIS NUMBER IS NOT A PRIME,NOT A PALINDROME AND ALSO NOT AN ARMSTRONG.");
	}
}
		
		