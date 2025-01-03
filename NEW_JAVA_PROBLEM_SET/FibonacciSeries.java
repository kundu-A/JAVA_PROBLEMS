import java.util.*;
class Solution{

}
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number to find Fibonacci Series: ");
        int nums=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=nums;i++){
            System.out.print((a+b)+" ");
            b=a+b;
            a=b-a;
        }
        sc.close();
    }
}
