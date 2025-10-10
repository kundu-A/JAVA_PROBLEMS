import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to calculate the factorial: ");
        int n=sc.nextInt();
        int result=calculateFactorial(n);
        System.out.println("Factorial of "+n+" is: "+result);
        sc.close();
    }
    public static int calculateFactorial(int n){
        if(n==0 || n==1)
            return 1;
        int p=1;
        for(int i=2;i<=n;i++)
            p=p*i;
        return p;
    }
}
