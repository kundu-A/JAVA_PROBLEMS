import MethodOverride.Calculation;
class Demo extends Calculation
{
    public void addition(int a,int b)
    {
        System.out.println(a+""+b);
    }
}
public class CalculationImplements {
    public static void main(String[] args) {
        int a=10,b=20;
        Calculation ob1=new Calculation();
        ob1.addition(a, b);
        Demo ob=new Demo();
        ob.addition(a, b);
    }
}
