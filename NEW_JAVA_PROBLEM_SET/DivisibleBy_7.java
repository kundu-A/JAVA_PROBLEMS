import java.util.*;
public class DivisibleBy_7 {
    public static boolean isdivisible(int num){
        while(num>0)
            num=(num/10)-(2*(num%10));
        if(num%7==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to check is it divisible by 7 or not: ");
        int num=sc.nextInt();
        System.out.println(isdivisible(num));
        sc.close();
    }
}
