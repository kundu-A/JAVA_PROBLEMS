//Without parameter
@FunctionalInterface
interface A{
    void show();
}
//Multiple parameter
@FunctionalInterface
interface B{
    void add(int a, int b);
}
//Single parameter
@FunctionalInterface
interface C{
    void displayAge(int x);
}

//Method with return type.
@FunctionalInterface
interface D{
    int multiplication(int x, int y);
}

public class LambdaExpression {
    public static void main(String[] args) {
        A a=()->System.out.println("In show method....");
        a.show();

        B b=(int i,int j)->System.out.println("Sum of "+i+" and "+j+" = "+i+j);
        b.add(10, 20);

        C c=x->System.out.println("My age is "+x);
        c.displayAge(22);

        D d=(x1,y1)->x1+y1;
        int result = d.multiplication(10, 20);
        System.out.println(result);
    }
}
