/*
 * Process: 9!=0 -> true , temp=9 , b=6%9 -> b=6 , a=9.
 *          6!=0 -> true , temp=6, b=9%6 -> 3 ,a=6
 *          3!=0 ->true , temp=3, b=6%3 -> 0 , a=3
 *          0!=0 -> false -> loop terminated
 */
import java.util.*;
public class Interview_FindGCD {
    public static int findGCD(int a , int b){
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=findGCD(a, b);
        System.out.println("The Greatest Common Divisor of "+a+" and "+b+" is: "+gcd);
        sc.close();
    }
}
