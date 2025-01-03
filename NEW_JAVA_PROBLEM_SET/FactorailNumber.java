import java.util.*;
public class FactorailNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to find Factorial : ");
        int input=sc.nextInt();
        int result=1;
        for(int i=1;i<=input;i++)
            result=result*i;
        System.out.println(result);
        sc.close();
    }
}
