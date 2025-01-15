import java.util.*;
class Solution{
    static Scanner sc=new Scanner(System.in);
    public static void areaAndPerimeterOfCircle(){
        System.out.println("------------------CIRCLE------------------");
        System.out.println("Please enter the redius of the Circle: ");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
        System.out.println("The Area of the Circle is: "+area);
        System.out.println("The Perimeter of the Circle is: "+perimeter);
    }
    public static void areaAndPerimeterOfTriangle(){
        System.out.println("------------------TRIANGLE------------------");
        System.out.println("Please enter the base of the Triangle: ");
        double base=sc.nextDouble();
        System.out.println("Please enter the height of the Triangle: ");
        double height=sc.nextDouble();
        double area=0.5*base*height;
        System.out.println("The Area of the Triangle is: "+area);

        System.out.println("Please enter the 1st side of the Triangle: ");
        double side1=sc.nextDouble();
        System.out.println("Please enter the 2nd side of the Triangle: ");
        double side2=sc.nextDouble();
        double perimeter=base+side1+side2;
        System.out.println("The Perimeter of the Triangle is: "+perimeter);
    }
    public static void areaOfParallelogram(){
        System.out.println("------------------PARALLELOGRAM------------------");
        System.out.println("Please enter the base of the Parallelogram: ");
        double base=sc.nextDouble();
        System.out.println("Please enter the height of the Parallelogram: ");
        double height=sc.nextDouble();
        double area=base*height;
        System.out.println("The Area of the Parallelogram is: "+area);
    }
    public static void areaOfRhombus(){
        System.out.println("------------------RHOMBUS------------------");
        System.out.println("Please enter the 1st Diagonal of Rhombus: ");
        double d1=sc.nextDouble();
        System.out.println("Please enter the 2nd Diagonal of Rhombus: ");
        double d2=sc.nextDouble();
        double area=0.5*d1*d2;
        System.out.println("The Area of the Rhombus is: "+area);
    }
    public static void areaOfTrapezium(){
        System.out.println("------------------TRAPEZIUM------------------");
        System.out.println("Please enter the 1st base of the Trapezium: ");
        double base1=sc.nextDouble();
        System.out.println("Please enter the 2nd base of the Trapezium: ");
        double base2=sc.nextDouble();
        System.out.println("Please enter the height of the Trapezium: ");
        double height=sc.nextDouble();
        double area=0.5*(base1+base2)*height;
        System.out.println("The Area of the Trapezium is: "+area);
    }
    public static void volumeAndSurfaceOfCone(){
        System.out.println("------------------CONE------------------");
        System.out.println("Pleaae the redious of cone: ");
        double r=sc.nextDouble();
        System.out.println("Please enter the height of cone: ");
        double h=sc.nextDouble();
        double l=Math.pow((r*r + h*h), 0.5);
        double surface=3.14*r*(r+l);
        double volume=3.14*r*r*h*0.3;
        System.out.println("The Surface of Cone is: "+surface+"\nThe Volume of Cone is: "+volume);
    }
    public static void volumeAndSurfaceOfCuboids(){
        System.out.println("------------------CUBOIDS------------------");
        System.out.println("Please enter the length of the Cuboid: ");
        double l=sc.nextDouble();
        System.out.println("Please enter the width of the Cuboid: ");
        double w=sc.nextDouble();
        System.out.println("Please enter the height of the Cuboid: ");
        double h=sc.nextDouble();
        double volume=l*w*h;
        double surface=2*((l*w)+(l*h)+(h*w));
        System.out.println("The Surface area of the Cuboid is: "+surface);
        System.out.println("The Volumn of the Cuboid: "+volume);
    }
    public static void volumeAndSurfaceOfSphere(){
        System.out.println("------------------SPHERE------------------");
        System.out.println("Please enter the redious of the Sphere: ");
        double r=sc.nextDouble();
        double volume=4*3.14*r*r;
        double surface=(3.14*r*r*r*4)/(double)3;
        System.out.println("The Volume of the Sphere: "+volume);
        System.out.println("The Surface area of the Sphere: "+surface);
    }
    public static void areaAndPerimeterOfRectangle(){
        System.out.println("------------------RECTANGLE------------------");
        System.out.println("Please enter the length of the Rectangle: ");
        double l=sc.nextDouble();
        System.out.println("Pleasee enter the width of the Rectangle: ");
        double w=sc.nextDouble();
        double area=l*w;
        double perimeter=2*(l+w);
        System.out.println("The Area of the Rectangle: "+area);
        System.out.println("The Perimeter of the Ractangle: "+perimeter);
    }

}
public class AreaCalculations {
    public static void main(String[] args) {
        Solution.areaAndPerimeterOfCircle();
        System.out.println("*****************************************************");
        Solution.areaOfParallelogram();
        System.out.println("*****************************************************");
        Solution.areaOfRhombus();
        System.out.println("*****************************************************");
        Solution.areaAndPerimeterOfTriangle();
        System.out.println("*****************************************************");
        Solution.areaOfTrapezium();
        System.out.println("*****************************************************");
        Solution.volumeAndSurfaceOfCone();
        System.out.println("*****************************************************");
        Solution.volumeAndSurfaceOfCuboids();
        System.out.println("*****************************************************");
        Solution.volumeAndSurfaceOfSphere();
        System.out.println("*****************************************************");
        Solution.areaAndPerimeterOfRectangle();
        System.out.println("*****************************************************");
    }
}
