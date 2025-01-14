import java.util.*;
class Solution{
    static Scanner sc=new Scanner(System.in);
    public static void areaOfCircle(){
        System.out.println("Please enter the redius of the Circle: ");
        double r=sc.nextDouble();
        double area=2*3.14*r;
        System.out.println("The Area of the Circle is: "+area);
    }
    public static void areaOfTriangle(){
        System.out.println("Please enter the base of the Triangle: ");
        double base=sc.nextDouble();
        System.out.println("Please enter the height of the Triangle: ");
        double height=sc.nextDouble();
        double area=0.5*base*height;
        System.out.println("The Area of the Triangle is: "+area);
    }
    public static void areaOfParallelogram(){
        System.out.println("Please enter the base of the Parallelogram: ");
        double base=sc.nextDouble();
        System.out.println("Please enter the height of the Parallelogram: ");
        double height=sc.nextDouble();
        double area=base*height;
        System.out.println("The Area of the Parallelogram is: "+area);
    }
    public static void areaOfRhombus(){
        System.out.println("Please enter the 1st Diagonal of Rhombus: ");
        double d1=sc.nextDouble();
        System.out.println("Please enter the 2nd Diagonal of Rhombus: ");
        double d2=sc.nextDouble();
        double area=0.5*d1*d2;
        System.out.println("The Area of the Rhombus is: "+area);
    }
}
public class AreaCalculations {
    public static void main(String[] args) {
        Solution.areaOfCircle();
        Solution.areaOfParallelogram();
        Solution.areaOfRhombus();
        Solution.areaOfTriangle();
    }
}
