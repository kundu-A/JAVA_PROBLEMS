import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);
        swapWithoutThirdNumber(a, b);
        sc.close();
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Now your 1st value: "+a+" and 2nd value: "+b);
    }
    public static void swapWithoutThirdNumber(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Now your 1st value: "+a+" and 2nd value: "+b);
    }
}
