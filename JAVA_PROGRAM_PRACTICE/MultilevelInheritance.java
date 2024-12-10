class Human
{
	public void Live()
	{
		System.out.println("HUMANS ARE NEED TO FIGHT TO SURVIVE.");
	}
}
class Father extends Human
{
	public void eat()
	{
		System.out.println("FATHER LOVES TO EAT COFFEE.");
	}
}
class Me extends Father
{
	public void eat()
	{
		System.out.println("I AM GOING TO EAT TEA.");
	}
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		Father f=new Father();
		f.Live();
		f.eat();
		Me m=new Me();
		m.Live();
		m.eat();
		Human h=new Human();
		h.Live();
		//h.eat();
	}
}