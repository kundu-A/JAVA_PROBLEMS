class Test{
int k=20;//INSTANCE VARIABLE.
int p=30;
static int a=40;//STATIC VARIABLR.
static int b=50;
static void m2()//STATIC METHOD.
{
	Test ob=new Test();
	System.out.println(a);
	System.out.println(b);
	System.out.println(ob.k);
	System.out.println(ob.p);
}
void m1()// INSTANCE METHOD
{
	System.out.println(k);
	System.out.println(p);
	System.out.println(Test.a);
	System.out.println(Test.b);
}
public static void main(String ar[])
{
	Test ob=new Test();
ob.m1();//calling instance method by object
ob.m2();//calling static method by class name.
}
}