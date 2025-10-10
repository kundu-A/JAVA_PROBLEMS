import java.util.Scanner;

public class PrimeNumberChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to check it is prime or not: ");
        int num=sc.nextInt();
        System.out.println(num+"is Prime: "+isPrime(num));
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        return false;
    }   
}
