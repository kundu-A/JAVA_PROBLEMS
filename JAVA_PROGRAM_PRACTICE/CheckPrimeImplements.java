import CheckPrime.*;
import java.util.*; 
public class CheckPrimeImplements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to check one number is prime or not\1tEnter 2 to check hoe many prime in the array: ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1: System.out.println("Enter a number to check it prime or not!!!: ");
                    int n=sc.nextInt();
                    PrimeNumber.isPrime(n);
                    break;
            case 2: System.out.println("Enter the range of an array: ");
                    int r=sc.nextInt();
                    int ar[]=new int[r];
                    System.out.println("Enter values in array: ");
                    for(int i=0;i<r;i++)
                    ar[i]=sc.nextInt();
                    PrimeInArray ob=new PrimeInArray();
                    ob.primeInArray(ar);
                    break;
            default:System.out.println("Please enter correct choice..... in next time.");
                break;
        }
        
    }
}
