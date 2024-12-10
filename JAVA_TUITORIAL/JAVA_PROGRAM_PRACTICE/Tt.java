class Base
{
	public static void display(){
		System.out.println("STATIC OR CLASS METHOD FROM BASE");
	}
	public void print(){
	System.out.println("NON STATIC OR INSTANCE METHOD FROM BASE");
	}
}
public class Tt{
	public static void main(String args[])
	{
		Base obj1=new Base();
		obj1.print();
		obj1.display();
	}
}
