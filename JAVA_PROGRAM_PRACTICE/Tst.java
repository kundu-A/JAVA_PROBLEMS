class Tst extends java.lang.Object
{
	int s1=50,s2=80;
	String snm="Asit";
	public String toString()
	{
		return (s1+s2+"..."+snm);
	}
	public static void main(String args[])
	{
		Tst ob=new Tst();
		System.out.println(ob);
	}
}