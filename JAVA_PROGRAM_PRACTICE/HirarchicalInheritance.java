class Parent
{
	public void eat()
	{
		System.out.println("HUMAN NEED FOOD TO EAT.");
	}
	public void run()
	{
		System.out.println("HUMAN NEED ENARGY TO RUN.");
	}

}
class Child1 extends Parent
{
	public void eat()
	{
		System.out.println("GOUTAM LOVES FASTFOOD.");
	}	
}
class Child2 extends Parent
{
	public void eat()
	{
		System.out.println("ARPAN LOVES HEALTHY FOOD.");
	}	
}
class Child3 extends Parent
{
	public void eat()
	{
		System.out.println("HUMAN CAN EAT ALL THINGS.");
	}	
}
class MethodCalling
{
	public void methodCalling(Parent ob)
	{
		ob.run();
		ob.eat();
	}
}
class HirarchicalInheritance
{
	public static void main(String args[])
	{
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Child3 c3=new Child3();
		MethodCalling mc=new MethodCalling();
		mc.methodCalling(c1);
		mc.methodCalling(c2);
		mc.methodCalling(c3);
	}
}