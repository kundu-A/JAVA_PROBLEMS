import java.util.*;
public class Interview_SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("After swapping.....");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        sc.close();
    }
}
