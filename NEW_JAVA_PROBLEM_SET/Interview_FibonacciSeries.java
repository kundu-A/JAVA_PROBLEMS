import java.util.*;
public class Interview_FibonacciSeries {
    public static int usingRecursion(int num){
        if(num<=1)
            return num;
        else
            return usingRecursion(num-1)+usingRecursion(num-2);
    }
    public static void normalTechnique(int num){
        if(num<=1){
            System.out.println(0);
            return;
        }
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<num;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num=sc.nextInt();
        System.out.println("Using Recursion: ");
        for(int i=0;i<num;i++)
            System.out.print(usingRecursion(i)+" ");
        System.out.println("\nUsing Normal Technique: ");
        normalTechnique(num);
        sc.close();
    }
}
