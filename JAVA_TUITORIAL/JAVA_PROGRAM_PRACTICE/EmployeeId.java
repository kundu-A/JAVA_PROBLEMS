import java.util.*;
interface Information
{
	public void getData();
	public void calculateSalary();
	public void display();
}
class Programmer implements Information
{
	int bs=20000,b=5,gs;
	String name;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("ENTER YOUR NAME: ");
		name=sc.nextLine();	
	}
	public void calculateSalary()
	{
		gs=(bs*b)/100;
		gs=gs+bs;
	}
	public void display()
	{
		System.out.println("EMPLOYEE POSITION : PROGRAMMER.");
		System.out.println("PROGRAMMER NAME IS: "+name);
		System.out.println("PROGRAMMERS TOTAL SALARY: "+gs);
	}

}
class Developer implements Information
{
	int bs=40000,b=10,gs;
	String name;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("ENTER YOUR NAME: ");
		name=sc.nextLine();	
	}
	public void calculateSalary()
	{
		gs=(bs*b)/100;
		gs=gs+bs;
	}
	public void display()
	{
		System.out.println("EMPLOYEE POSITION : DEVELOPER.");
		System.out.println("DEVELOPER NAME IS: "+name);
		System.out.println("DEVELOPER TOTAL SALARY: "+gs);
	}

}
class Manager implements Information
{
	int bs=60000,b=10,gs;
	String name;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("ENTER YOUR NAME: ");
		name=sc.nextLine();	
	}
	public void calculateSalary()
	{
		gs=(bs*b)/100;
		gs=gs+bs;
	}
	public void display()
	{
		System.out.println("EMPLOYEE POSITION : MANAGER.");
		System.out.println("MANAGER NAME IS: "+name);
		System.out.println("MANAGER TOTAL SALARY: "+gs);
	}

}
class MethodCalling 
{
	public void calling(Information ob)
	{
		ob.getData();
		ob.calculateSalary();
		ob.display();
	}
}
public class EmployeeId
{
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		Developer d=new Developer();
		Manager m=new Manager();
		MethodCalling ob=new MethodCalling();
		ob.calling(p);
		ob.calling(d);
		ob.calling(m);
	}
}