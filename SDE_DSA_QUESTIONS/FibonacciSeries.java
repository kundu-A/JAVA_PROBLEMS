import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the limit: ");
        int limit=sc.nextInt();
        fibonacciSeries(limit);
        sc.close();
    }
    public static void fibonacciSeries(int limit){
        int a=0,b=1;
        System.out.print(a+" "+b);
        for(int i=2;i<limit;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
